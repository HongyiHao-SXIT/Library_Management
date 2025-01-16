package com.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.entity.User;
public class Manager extends User  {
    @TableId(type = IdType.AUTO)
    private int id;

    private String account;

    private String password;

    private String icon;

    private String introduce;

    private String usertype = "Manager";


    public String getintro() {
		return introduce;
	}

	public void setintro(String intro) {
		introduce = intro ;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



}
