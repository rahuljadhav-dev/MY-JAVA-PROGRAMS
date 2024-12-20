package com.student.application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Welocme {
	public static void main(String[] args) throws Exception{
		System.out.println("Welcome to student management app");
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Press 1 to add student!");
			System.out.println("Press 2 to delete student!");
			System.out.println("Press 3 to display student!");
			System.out.println("Press 4 to update student");
			System.out.println("Press 5 to exit!");
			int c=Integer.parseInt(b.readLine());
			
			if(c==1) {
				//add student
				System.out.println("Enter student name:");
				String name=b.readLine();
				
				System.out.println("Enter studnet phone number:");
				String phone=b.readLine();
				
				System.out.println("Enter student city:");
				String city=b.readLine();
				
				System.out.println("Enter student id:");
				int id=Integer.parseInt(b.readLine());
				
				Student s=new Student(id, name, phone, city);
				boolean ans=Stodb.inserttoDB(s);
				if(ans) {
					System.out.println("Student add successfully into the database!");
				}else
					System.out.println("Something went wrong!");
				
			}
			else if(c==2) {
				//delete student
				System.out.println("Delete student using id");
				int id=Integer.parseInt(b.readLine());
				boolean ans=Stodb.deleteUser(id);
				if(ans) {
					System.out.println("Student deleted successfulyy!");
				}else
					System.out.println("Something went wrong!");
				
				
			}else if(c==3) {
				//display student\
				Stodb.displayStudent();
				
			}else if(c==4) {
				System.out.println("Enter Id:");
				int id=Integer.parseInt(b.readLine());
				System.out.println("Enter name:");
				String name=b.readLine();
				boolean ans=Stodb.updateUser(id,name);
				if(ans) {
					System.out.println("Student updated.....");
				}else
					System.out.println("Something went wrong....");
				
				
			}else if(c==5) {
				break;
			}
			
		}
		System.out.println("Thank you for using my application!");
	}

}
