package com.chinasoft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chinasoft.pojo.Cart;
import com.chinasoft.pojo.CartDetail;

public interface CartMapper {
	public void insertCart(Cart c);
	
	
	public List<CartDetail> selectAll(int id);
	
	
	public void deleteCartById(int id);
	
	
	public List<CartDetail> selectByPageNo(@Param("id") int id,@Param("startIndex")int startIndex,@Param("pageCount") int pageCount);
	
	public int getCount(int id);
}
