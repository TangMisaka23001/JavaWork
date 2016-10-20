package com.lsu.misaka.goods;

import com.lsu.misaka.domain.Goods;

public class Apple extends Goods{
	static final int id = 1;
	static final String name = "apple";
	static final int price = 10;
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
