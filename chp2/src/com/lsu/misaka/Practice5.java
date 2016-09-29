package com.lsu.misaka;

public class Practice5 {

	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++){
			for (int j = 0; j <= 9; j++){
				for (int k = 0; k <= 9; k++){
					if (i*100+j*10+k == Math.pow(i, 3)+Math.pow(j, 3)+Math.pow(k, 3)){
						System.out.printf("%d%d%d\n",i,j,k);
					}
				}
			}
		}
	}

}
