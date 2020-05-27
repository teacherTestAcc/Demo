package com.chinasoft.pojo;

import java.util.Date;

public class Cart {
	private int cartId;
	private int lineId;
	private int uid;
	private Date makeTime;
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getLineId() {
		return lineId;
	}
	public void setLineId(int lineId) {
		this.lineId = lineId;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public Date getMakeTime() {
		return makeTime;
	}
	public void setMakeTime(Date makeTime) {
		this.makeTime = makeTime;
	}
	public Cart(int cartId, int lineId, int uid, Date makeTime) {
		super();
		this.cartId = cartId;
		this.lineId = lineId;
		this.uid = uid;
		this.makeTime = makeTime;
	}
	public Cart(int lineId, int uid, Date makeTime) {
		super();
		this.lineId = lineId;
		this.uid = uid;
		this.makeTime = makeTime;
	}
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
}
