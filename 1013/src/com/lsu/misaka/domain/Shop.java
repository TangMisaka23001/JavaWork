package com.lsu.misaka.domain;

public class Shop {
	private String username;
	private String goodsname;
	private int count;
	private int sum;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getGoodsname() {
		return goodsname;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getSum() {
		return sum;
	}
	public Shop(String username, String goodsname, int count,int sum) {
		super();
		this.username = username;
		this.goodsname = goodsname;
		this.count = count;
		this.sum = sum;
	}
	
}
