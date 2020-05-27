package com.chinasoft.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chinasoft.pojo.Users;
import com.chinasoft.service.UsersService;

@Controller
public class UsersController {
	@Autowired
	private UsersService us;
	
	public UsersService getUs() {
		return us;
	}

	public void setUs(UsersService us) {
		this.us = us;
	}

	@RequestMapping("/qt/checkLogin")
	public String login(String username,String password,HttpSession session) {
		Users u=us.checkLogin(username, password);
		if(u!=null) {
			if(u.getSfno()==1) {
				//管理员用户
				return "redirect:../ht/index.html";
			}else {
			//登录成功
				session.setAttribute("loginUser", u);
				return "showAll";//返回一个视图，最后会在浏览器上显示
			}
		}else {
			//登录失败
			return "login.html";
		}
	}
}
