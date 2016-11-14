package com.lsu.misaka;

public class Test1 {
	
	
	public static void main(String[] args) {
		String a = "abcdefghijklmnopqrstuvwxyz";
		String b = "TestcodeAbCdEf";
		System.out.println("原字符串为："+b);
		System.out.println("小写字符为：");
		for(int i = 0; i <= b.length()-1; i++){
			String c = ""+b.charAt(i);
			if (a.contains(c)){
				System.out.print(c);
			}
		}
		System.out.println();
		System.out.println("大写字符为：");
		for(int i = 0; i <= b.length()-1; i++){
			String c = ""+b.charAt(i);
			if (!a.contains(c)){
				System.out.print(c);
			}
		}
	}
}
