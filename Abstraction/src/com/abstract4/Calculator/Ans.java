package com.abstract4.Calculator;
import java.util.*;

public class Ans {
	public static void main(String[] args) {
		System.out.println("Enter Number :");
		Operations op=new Operations();
		op.Addition();
		System.out.println("The sum is :"+op.Addition());
		
		op.Multiplication();
		System.out.println("The multiplication is :"+op.Multiplication());
		
		op.Substraction();
		System.out.println("The substraction is :"+op.Substraction());
		
		op.Division();
		System.out.println("The division is :"+op.Division());
		
		
	}

}
