package com.lsu.misaka;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Practice2 {
	public static void main(String[] args) {
		List<Integer> list  = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 0; ; i++){
			int temp = (int)(Math.random()*100)%29;
			if(!set.contains(temp)){
				set.add(temp);
				list.add(temp);
			}
			if(list.size() >= 10) break;
		}
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
	}
}
