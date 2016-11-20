package com.lsu.misaka;

public class Student {
	
	int id;
	int grade;
	int score;
	public Student(){
		id = (int)(Math.random()*30)%28+1;
		grade = (int)(Math.random()*6)%5+1;
		score = (int)(Math.random()*50)+50;
	}
	public Student(int score){
		this.score = score;
	}
	
	
	public int getId() {
		return id;
	}



	public int getGrade() {
		return grade;
	}



	public int getScore() {
		return score;
	}

	

	@Override
	public String toString() {
		return "id=" + id + ": grade=" + grade + ", score=" + score + "";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student){
			Student stu = (Student)obj;
			if(stu.getId() == id){
				return true;
			}else
				return false;
		}
		return false;
	}
}
