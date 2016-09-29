package com.lsu.misaka;

import java.util.Random;
import java.util.Scanner;

public class Project2 {

	public static void main(String[] args) {
		int a,b,answer,grade = 0;
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0;i < 5; i++){
			switch (random.nextInt(4)) {
			case 0:
				a = random.nextInt(100);
				b = random.nextInt(100);
				System.out.println(a+"+"+b+"=?");
				if (a + b == scanner.nextInt()){
					grade += 20;
				}
				break;
	
			case 1:
				a = random.nextInt(100);
				b = random.nextInt(100);
				System.out.println(a+"-"+b+"=?");
				if (a - b == scanner.nextInt()){
					grade += 20;
				}
				break;
			case 2:
				a = random.nextInt(100);
				b = random.nextInt(100);
				System.out.println(a+"*"+b+"=?");
				if (a * b == scanner.nextInt()){
					grade += 20;
				}
				break;
			case 3:
				a = random.nextInt(100);
				b = random.nextInt(100);
				System.out.println(a+"/"+b+"=?");
				if (a / b == scanner.nextInt()){
					grade += 20;
				}
				break;
			}
			
		}
		System.out.println("the grade is:  "+grade);
	}

}
