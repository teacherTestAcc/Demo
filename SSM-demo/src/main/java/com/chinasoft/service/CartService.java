package com.chinasoft.service;

import java.util.List;

import com.chinasoft.pojo.Cart;
import com.chinasoft.pojo.CartDetail;

public interface CartService {
	public void addLineToCart(Cart c);
	
	public List<CartDetail> getALL(int id);
	
	public void dropCart(int id);
	
	public List<CartDetail> getCartByPageNo(int id,int pageNo,int pageCount);
	
	public int getPageMaxNum(int id,int pageCount);
}
