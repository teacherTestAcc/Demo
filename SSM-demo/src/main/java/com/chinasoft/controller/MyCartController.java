package com.chinasoft.controller;


import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chinasoft.pojo.Cart;
import com.chinasoft.pojo.CartDetail;
import com.chinasoft.pojo.Users;
import com.chinasoft.service.CartService;

@Controller
public class MyCartController {
	@Autowired
	private CartService cs;

	public CartService getCs() {
		return cs;
	}

	public void setCs(CartService cs) {
		this.cs = cs;
	}
	@RequestMapping("/aaa")
	public String execute() {
		return "index.html";
	}
	
	
	@RequestMapping("/qt/addCart")
	public String addCart(int id,HttpSession session) {
		Users u=(Users) session.getAttribute("loginUser");
		int uid=u.getUid();
		Cart c=new Cart(id, uid, new Date());
		cs.addLineToCart(c);
		return  "getCart";
	}
	
	/*
	 * 获取当前用户的所有购物信息
	 * */
	@RequestMapping("/qt/getCart")
	public String getCart(HttpSession session,String page) {
		int pageNo=1;
		if(page!=null) {
			pageNo=Integer.valueOf(page);
		}
		Users u=(Users) session.getAttribute("loginUser");
		int uid=u.getUid();
		int pageCount=4;
		List<CartDetail> ls=cs.getCartByPageNo(uid,pageNo, pageCount);
		int pageNum=cs.getPageMaxNum(uid,pageCount);
		session.setAttribute("pageNo", pageNo);
		session.setAttribute("pageNum", pageNum);
		session.setAttribute("ls", ls);
		return "cart.jsp";
	}
	
	/*
	 * 根据id删除购物车数据库
	 * */
	@RequestMapping("/qt/dropCart")
	public void dropCart(int id) {
		System.out.println(id);
		cs.dropCart(id);
	}
}
