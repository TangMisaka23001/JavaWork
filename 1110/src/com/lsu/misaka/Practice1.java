package com.lsu.misaka;

import java.util.HashSet;
import java.util.Iterator;

public class Practice1 {
	public static void main(String[] args) {
		HashSet<Double> set = new HashSet();
		for(int i = 0; ;i++){
			set.add(Math.random()*100);
			if(set.size() == 10) break;
		}
		Iterator it = set.iterator();
		Double max = -1.0, min = 1000.0;
		while(it.hasNext()){
			Double temp = (Double)it.next();
			if(max < temp){
				max = temp;
			}else if(min > temp){
				min = temp;
			}
		}
		System.out.println("MaxNumber:"+max);
		System.out.println("MinNumber:"+min);
	}
}
