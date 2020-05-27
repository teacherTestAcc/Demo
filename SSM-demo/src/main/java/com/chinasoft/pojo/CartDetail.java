package com.chinasoft.pojo;

public class CartDetail {
	private int cartId;
	private String mainPic;
	private int lineId;
	private String lineName;
	private String vehicle;
	private double teamprice;
	
	public String getMainPic() {
		return mainPic;
	}
	public void setMainPic(String mainPic) {
		this.mainPic = mainPic;
	}
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
	public String getLineName() {
		return lineName;
	}
	public void setLineName(String lineName) {
		this.lineName = lineName;
	}
	public String getVehicle() {
		return vehicle;
	}
	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}
	public double getTeamprice() {
		return teamprice;
	}
	public void setTeamprice(double teamprice) {
		this.teamprice = teamprice;
	}
	public CartDetail(int cartId, String mainPic, int lineId, String lineName, String vehicle, double teamprice) {
		super();
		this.cartId = cartId;
		this.mainPic = mainPic;
		this.lineId = lineId;
		this.lineName = lineName;
		this.vehicle = vehicle;
		this.teamprice = teamprice;
	}
	public CartDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
}
