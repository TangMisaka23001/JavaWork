package com.lsu.masaka;

import java.util.Scanner;

public class Project5 {
	public static void main(String[] args) {
		int data = 0, i =2, j = 0;
		int[] a = new int[100];
		Scanner scanner = new Scanner(System.in);
		data = scanner.nextInt();
		System.out.print(data+"=");
		while (data > 1){
			if (data % i == 0){
				data /= i;
				if (j == 0){
					System.out.print(i);
				}
				else  if (j != 0){
					
					System.out.print("*"+i);
				}
			}
			else i++;
			j++;
		}
	}
}
