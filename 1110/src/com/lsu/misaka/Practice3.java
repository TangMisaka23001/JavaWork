package com.lsu.misaka;

import java.util.HashSet;
import java.util.Iterator;

public class Practice3 {
	public static void main(String[] args) {
		Point point;
		HashSet<Point> set = new HashSet<Point>();
		while(true){
			point = new Point();
			set.add(point);
			if(set.size() == 20) break;
		}
		Iterator<Point> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next().toString());
		}
	}
}
