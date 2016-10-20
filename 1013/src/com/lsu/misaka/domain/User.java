package com.lsu.misaka.domain;

import java.util.ArrayList;

public class User {

	private int id;
	private String username;
	private int money;
	private ArrayList<Shop> shoplist;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public void setShop(ArrayList<Shop> shop) {
		this.shoplist = shop;
	}
	public ArrayList<Shop> getShop() {
		return shoplist;
	}
	public User(ArrayList<Shop> shoplist) {
		this.shoplist = shoplist;
	}
	
}
