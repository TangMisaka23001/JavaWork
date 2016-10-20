package com.lsu.misaka.service;

import java.util.ArrayList;

import com.lsu.misaka.domain.Shop;
import com.lsu.misaka.domain.User;
public class ShopMain {

	public static void main(String[] args) {
		ArrayList<Shop> shopList = new ArrayList<Shop>();
		User user = new User(shopList);
		Service service = new Service();
		service.login(user);
		service.showGoods();
		service.chooseGoods(user);
		service.showShopList(user);
	}

}
