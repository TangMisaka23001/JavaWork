package com.lsu.masaka;

import java.util.Scanner;

public class Project1 {
	public static void main(String[] args) {
		int a = 0,b = 0,c = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("input three number");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		if (a > b){
			int t = a;
			a = b;
			b = t;
		}
		if (b > c){
			int t = b;
			b = c;
			c = t;
		}
		System.out.println("by sort:");
		System.out.println(a+"   "+b+"   "+c);
	}
}
