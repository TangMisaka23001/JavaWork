package com.lsu.masaka;

public class Project3 {
	public static void main(String[] args) {
		int ans = 0, temp = 1;
		for (int i = 1; i <= 10; i++){
			temp *= i;
			ans += temp;
		}
		System.out.println(ans);
	}
}
