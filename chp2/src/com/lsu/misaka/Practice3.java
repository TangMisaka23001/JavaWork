package com.lsu.misaka;

public class Practice3 {

	public static void main(String[] args) {
		String[] s = new String[100];
		int j;
		for (int i = 0; i <= 10; i++ ){
			s[i] = "";
		}
		for (int i = 1; i <= 9; i++){
			for ( j = 1; j<=i; j++){
				s[i] += new String(i+"*"+j+"="+i*j+" ");
			}
		}
		for (int i = 9; i >= 1; i--){
			System.out.printf("%-62s %62s\n",s[i],reverse(s[i]));
		}
		for (int i = 1; i <= 9; i++){
			System.out.printf("%-62s %62s\n",s[i],reverse(s[i]));
		}
	}
	public static String reverse(String str){
		return new StringBuilder(str).reverse().toString();
	}
}
