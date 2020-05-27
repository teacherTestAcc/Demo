package com.chinasoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasoft.mapper.CartMapper;
import com.chinasoft.pojo.Cart;
import com.chinasoft.pojo.CartDetail;
import com.chinasoft.service.CartService;
@Service
public class CartServiceImpl implements CartService{
	@Autowired
	private CartMapper cm;
	
	public CartMapper getCm() {
		return cm;
	}

	public void setCm(CartMapper cm) {
		this.cm = cm;
	}

	@Override
	public void addLineToCart(Cart c) {
		// TODO Auto-generated method stub
		cm.insertCart(c);
	}

	@Override
	public List<CartDetail> getALL(int id) {
		// TODO Auto-generated method stub
		return cm.selectAll(id);
	}

	@Override
	public void dropCart(int id) {
		// TODO Auto-generated method stub
		cm.deleteCartById(id);
	}

	@Override
	public List<CartDetail> getCartByPageNo(int id,int pageNo, int pageCount) {
		// TODO Auto-generated method stub
		return cm.selectByPageNo(id,(pageNo-1)*pageCount, pageCount);
	}

	@Override
	public int getPageMaxNum(int id,int pageCount) {
		// TODO Auto-generated method stub
		int pageMaxNum=0;
		int count=cm.getCount(id);//11
		if(count%pageCount==0) {
			pageMaxNum=count/pageCount;
		}else {
			pageMaxNum=count/pageCount+1;
		}
		return pageMaxNum;
	}

}
