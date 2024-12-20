package com.string.tasks;

public class Practice2 {
	public static void main(String[] args) {
		String name="my name is rahul";
		int check=0;
		for(int i=0;i<name.length();i++) {
			System.out.println(name.charAt(i)+"i");
			for(int j=0;j<name.length();j++) {
				System.out.println(name.charAt(j)+"j");
				if(name.charAt(i)==name.charAt(j)&& i!=j) {
//					System.out.println(name.charAt(j));
				}
			}
		}
		if(check==1) {
			System.out.println("does not have unique character ");
		}else
			System.out.println("all unique character ");
		
		
		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(name.charAt(i));
		}
	}

}
