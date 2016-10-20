package cn.lsu.misaka;

import java.util.ArrayList;

public class Student {
	private String name;
	private String password;
	private ArrayList<Classes> choosedClass;

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public ArrayList<Classes> getChoosedClass() {
		return choosedClass;
	}


	public void setChoosedClass(ArrayList<Classes> choosedClass) {
		this.choosedClass = choosedClass;
	}


	/**
	 * 方法
	 */
	
	public boolean login(String name,String password,Student stu){
		if (stu.getName().equals(name) && stu.getPassword().equals(password)){
			return true;
		}
		else return false;
	}
	public void chooseClass(Student stu,Classes classes){
		stu.getChoosedClass().add(classes);
	}
	public void showclasses(){
		ArrayList<Classes> classes = this.getChoosedClass();
		for (int i = 0; i < classes.size(); i++){
			System.out.println(classes.get(i));
		}
	}

	/**
	 * 构造方法
	 */
	public Student(String name, String password,ArrayList<Classes> choosedClass) {
		super();
		this.name = name;
		this.password = password;
		this.choosedClass = choosedClass;
	}
	
	
	
}
