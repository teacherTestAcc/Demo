package com.chinasoft.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinasoft.pojo.LineDetail;
import com.chinasoft.service.CartService;
import com.chinasoft.service.LineService;

@Controller
public class LineController {
	@Autowired
	private LineService ls;

	public LineService getLs() {
		return ls;
	}

	public void setLs(LineService ls) {
		this.ls = ls;
	}

	@RequestMapping("/qt/getLine")
	public String getLineDetail(String name,HttpSession session) {
		//查询单个线路的信息
		//System.out.println(name);
		LineDetail ld=ls.getLine(name);
		//System.out.println(ld.getLineName()+" "+ld.getMainPic()+" "+ld.getLineTypeName());
		session.setAttribute("ld", ld);
		return "redirect:detail.jsp";
	}
	
	@RequestMapping("/qt/showAll")
	public String showAll(HttpSession session) {
		String name="境内游";
		session.setAttribute("jn",ls.getLineByTypeName(name) ); 
		return "index.jsp";
	}
	
	@ResponseBody
	@RequestMapping("/ht/getAll")
	public List<LineDetail> getAll(){
		return  ls.getAll();
	}
	
}
