package com.lsu.misaka;

public class Test2 {
	
	
	public static void main(String[] args) {
		String a = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String b = "Testasdfggjqwrjpqojovzzzjljfazvbndkajshopqihfsldfjladsfjloiwpeqz";
		int temp = 0;
		for (int i = 0; i <= a.length()-1; i++){
			for(int j = 0; j <= b.length()-1; j++){
				if (a.charAt(i) == b.charAt(j)){
					temp++;
				}
			}
			System.out.println(a.charAt(i)+"出现的次数："+temp);
			temp = 0;
		}
	}
}
