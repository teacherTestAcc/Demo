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
				//����Ա�û�
				return "redirect:../ht/index.html";
			}else {
			//��¼�ɹ�
				session.setAttribute("loginUser", u);
				return "showAll";//����һ����ͼ�����������������ʾ
			}
		}else {
			//��¼ʧ��
			return "login.html";
		}
	}
}
