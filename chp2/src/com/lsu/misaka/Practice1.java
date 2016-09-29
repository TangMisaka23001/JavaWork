package com.lsu.misaka;

public class Practice1 {
	public static void main(String[] args) {
		boolean f;
    	int k = 1;
        for(int i = 2; i <= 100; i++){
            f = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    f = false;
                    break;
                }
            }
            if(f && k != 5){
                System.out.print(i + " ");
                k++;
            }
            else if(f){
            	System.out.print(i + "\n");
            	k = 1;
            }
        }
	}
}
