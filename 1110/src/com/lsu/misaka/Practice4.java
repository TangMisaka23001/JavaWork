package com.lsu.misaka;

import java.util.HashSet;
import java.util.Iterator;

public class Practice4 {
	public static void main(String[] args) {
		Student stu;
		HashSet<Student> set = new HashSet<Student>();
		while(true){
			stu = new Student();
			set.add(stu);
			if (set.size() == 20) break;
		}
		
		Iterator<Student> it = set.iterator();
		Student sh = new Student(-1);
		Student sl = new Student(100);
		while(it.hasNext()){
			Student temp = it.next();
			if(temp.getScore() > sh.getScore()){
				sh = temp;
			}else if(temp.getScore() < sl.getScore()){
				sl = temp;
			}
			System.out.println(temp.toString());
		}
		System.out.println("分数最高的学生:"+sh.toString());
		System.out.println("分数最低的学生:"+sl.toString());
	}
}
