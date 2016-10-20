package cn.lsu.misaka;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Classes class1 = new Classes("math",1);
		Classes class2 = new Classes("chinese",2);
		Classes class3 = new Classes("PE",3);
		ArrayList<Classes> classList = new ArrayList<>();
		ArrayList<Classes> choosedList = new ArrayList<>();
		classList.add(class1);
		classList.add(class2);
		classList.add(class3);
		Student stu = new Student("misaka","123",choosedList);
		System.out.println("请登录!用户名：");
		String name = scanner.next();
		System.out.println("密码：");
		String password = scanner.next();
		while(stu.login(name, password, stu)){
			System.out.println("登录成功！");
			System.out.println("请选择：1.选课\n2.列出已选课程\n3.退出！");
			int choose = scanner.nextInt();
			int temp=1;
			if (choose == 1){//进入选课
				System.out.println("课程清单：");
				for (int i=0; i< classList.size(); i++){
					System.out.println("ID:"+classList.get(i).getID()+"    "+classList.get(i).getName());
				}
				while(temp == 1){
				System.out.println("输入ID来选择课程");
				int id = scanner.nextInt();
				if(id == 1){
					stu.getChoosedClass().add(class1);
				}else if(id == 2){
					stu.getChoosedClass().add(class2);
				}else if (id == 3){
					stu.getChoosedClass().add(class3);
				}
				System.out.println("输入1继续选课，输入0退出选课");
				temp = scanner.nextInt();
				}
			}else if (choose == 2){//列出已选课程
				for(int i = 0; i< stu.getChoosedClass().size(); i++){
					System.out.println("ID:"+stu.getChoosedClass().get(i).getID()+"    "+stu.getChoosedClass().get(i).getName());
				}
			}else {//退出
				break;
			}
		}
	}

}
