package com.string.tasks;

public class Demo {
	public static void main(String[] args) {
		Practice1 a=new Practice1("kiran");
		Practice1 a1=new Practice1("jbk");
		Practice1 a2=new Practice1("kiran");
		String x="javabykiran";
		String y="jbk";
		String z=new String("javabykiran");
		String z1=new String("jbk");
		System.out.println(x==z);
		System.out.println(y==z);
		System.out.println(x.equals(y));
		System.out.println(x==y);
		System.out.println(x.equals(z));
		System.out.println(a==a);
		System.out.println(a1==a2);
		System.out.println(a.equals(a2));
		System.out.println(a1.equals(y));
		System.out.println(y.equals(z1));
		System.out.println(y.equals(a1));
		System.out.println(a.equals(a2));
	}

}
