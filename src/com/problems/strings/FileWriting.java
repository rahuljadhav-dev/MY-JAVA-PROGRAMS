package com.problems.strings;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;

public class FileWriting {
	
	public static void main(String[] args) {
		try (FileInputStream fileInputStream=new FileInputStream("program.txt")){
			int c;
			while((c=fileInputStream.read())!=-1) {
				System.out.print((char)c);
			}
//			String str="hey i am rahul";
//			f.write(str);
//			System.out.println("Succefully Written");
		} catch (Exception e) {
			System.out.println("Error");
			
		}
	}

}
