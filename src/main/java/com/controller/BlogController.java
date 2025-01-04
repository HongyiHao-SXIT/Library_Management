package main.java.com.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.common.api.R;
import com.common.utils.AuthUtil;
import com.entity.Blog;
import com.entity.User;
import com.mapper.BlogMapper;
import com.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/Blog")
public class BlogController {


    @Autowired
    private BlogMapper blogMapper;


    @Autowired
    private UserMapper userMapper;


    @PostMapping("/save")
    public R save(@RequestBody Blog blog) {
        blog.setAccount(AuthUtil.getUserAccount());
        blog.setCreateTime(new Date());
        blogMapper.insert(blog);
        return R.success("博客保存成功");
    }

    @GetMapping("/list")
    public R list(Blog blog) {
        LambdaQueryWrapper<Blog> wrapper = new LambdaQueryWrapper<>();

        wrapper.orderByAsc(Blog::getCreateTime);

        List<Blog> blogs = blogMapper.selectList(wrapper);

        for (Blog item : blogs) {
            LambdaQueryWrapper<User> userWrapper = new LambdaQueryWrapper<>();

            userWrapper.eq(User::getAccount, item.getAccount());

            User user = userMapper.selectOne(userWrapper);

            item.setIcon(user.getIcon());
        }

        return R.data(blogs);
    }
}