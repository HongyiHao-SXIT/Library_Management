package com.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Blog {
    @TableId(type = IdType.AUTO)
    private int id;

    private String account;

    private int blogId;

    private String type;

    private String theme;

    private String comment;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    @TableField(exist = false)
    private String icon;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getblogId() {
        return blogId;
    }

    public void setblogId(int blogId) {
        this.blogId = blogId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
    
    public String getTheme() {
        return theme;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    public String getcommnet() {
        return comment;
    }
}
