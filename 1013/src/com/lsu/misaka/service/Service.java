package com.lsu.misaka.service;


import java.util.Scanner;

import com.lsu.misaka.domain.Shop;
import com.lsu.misaka.domain.User;
import com.lsu.misaka.goods.Apple;
import com.lsu.misaka.goods.Pen;

public class Service {
	Scanner scanner = new Scanner(System.in);
	public void showGoods(){
		System.out.println("We have below Goods:");
		System.out.println("GoodsId:1 Name:"+Apple.getName()+"  Price is: "+Apple.getPrice());
		System.out.println("GoodsId:2 Name: "+Pen.getName()+"  Price is: "+Pen.getPrice());
	}
	public void chooseGoods(User user){
		
		int i=0;
		System.out.println("input 0 to start choose Goods:");
		while(scanner.nextInt() == 0 && user.getMoney() >= 0){
			System.out.println("choose goods by Id:");
			int id = scanner.nextInt();
			System.out.println("choose Goods count:");
			int count = scanner.nextInt();
			if (id == 1){
				user.getShop().add(new Shop(user.getUsername(),Apple.getName(),count,count*Apple.getPrice()));
			}
			else if (id == 2){
				user.getShop().add(new Shop(user.getUsername(),Pen.getName(),count,count*Pen.getPrice()));
			}
			if(user.getMoney()-user.getShop().get(i).getSum() >= 0){
				user.setMoney(user.getMoney()-user.getShop().get(i).getSum());
			}
			else {
				System.out.println("now you had rest:"+user.getMoney());
				System.out.println("you have no more money!");
			}
			i++;
			System.out.println("input 0 to continue choose Goods or input 1 to stop");
		}
		
	}
	public void showShopList(User user){
		int total=0;
		for (int i = 0; i < user.getShop().size(); i++){
			System.out.print("Goods name:"+user.getShop().get(i).getGoodsname());
			System.out.print(" count:"+user.getShop().get(i).getCount());
			System.out.println(" total price:"+user.getShop().get(i).getSum());
			total = user.getShop().get(i).getSum();
		}
		System.out.println("the total price is:"+total);
	}
	public void login(User user) {
		String username;
		System.out.println("input your username:");
		username = scanner.next();
		user.setUsername(username);
		user.setId(1);
		System.out.println("hello "+user.getUsername()+"!");
		user.setMoney(1000);
		System.out.println("now you have "+user.getMoney());
	}
}
