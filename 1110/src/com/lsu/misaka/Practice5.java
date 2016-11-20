package com.lsu.misaka;

public class Practice5 {
	public static void main(String[] args) {
		String str = "this is a test of java";
		int count = 0;
		//统计s出现的次数
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == 's') {
				count++;
			}
		}
		System.out.println("字符s的出现次数为:"+count);
		//截取test
		System.out.println(str.substring(10, 14));
		//多种方法复制字符串到数组
		char[] s = str.toCharArray();
		str.getChars(0, str.length(), s, 0);
		System.out.println(s);
		//首字母大写输出
		String[] sp = str.split(" ");
		for(String x : sp){
			System.out.print(x.substring(0,1).toUpperCase()+x.substring(1)+" ");
		}
		System.out.println();
		//字符串倒序输出
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		s = str.toCharArray();
		for(int i = s.length-1; i >=0; i--){
			System.out.print(s[i]);
		}
		//转换成字符串
		for(String x : sp){
			System.out.println(x);
		}
	}
}
