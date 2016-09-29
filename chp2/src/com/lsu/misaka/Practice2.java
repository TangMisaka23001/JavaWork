package com.lsu.misaka;

public class Practice2 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1900; i <= 2003; i++)
			if(leap(i)){
				sum+=i;
			}
		System.out.println(sum);
	}
	public static boolean leap(int year){
		if (year%400 == 0){
			return true;
		}
		else if (year%4 ==0 && year%100 != 0){
			return true;
		}
		else {
			return false;
		}
	}
}
