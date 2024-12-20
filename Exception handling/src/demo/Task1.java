package demo;
import java.util.*;

public class Task1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {11,23,44,65,78,99,255,44,34,654,897};
		int count=0;
		try {
			System.out.println("Enter index :");
			int n=sc.nextInt();
			System.out.println(arr[n]);
			
		} catch (Exception e) {
			System.out.println("Enter valid index!");
			System.out.println("The available array is given below :");
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
				count=i;
			}
			System.out.println("The availability of array index is :"+count);
		}
	}

}
