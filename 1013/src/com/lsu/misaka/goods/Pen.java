package com.lsu.misaka.goods;

import com.lsu.misaka.domain.Goods;

public class Pen extends Goods{
	static final int id = 2;
	static final String name = "pen";
	static final int price = 20;
	public static int getId() {
		return id;
	}
	public static String getName() {
		return name;
	}
	public static int getPrice() {
		return price;
	}
	
}
