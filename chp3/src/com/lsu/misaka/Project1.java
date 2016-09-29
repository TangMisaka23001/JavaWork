package com.lsu.misaka;

public class Project1 {

	public static void main(String[] args) {
		int[] arr = {1,5,7,2,8,0,4,9};
		System.out.println("≈≈–Ú«∞£∫");
		for (int x : arr){
			System.out.print(x+"  ");
		}
		selectSort(arr);
		System.out.println();
		System.out.println("≈≈–Ú∫Û£∫");
		for (int x : arr){
			System.out.print(x+"  ");
		}
	}
	public static void selectSort(int [] a) {
		int n = a.length;
		for(int k=0; k<n-1; k++) {
			int min = k;
			for(int i=k+1; i<n; i++) {
				if(a[i] < a[min]) {
					min = i;
				}
			}
			if(k != min) {
				int temp = a[k];
				a[k] = a[min];
				a[min] = temp;
			}
		}
	}

}
