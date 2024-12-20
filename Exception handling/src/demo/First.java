package demo;
import java.util.*;

public class First {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int roomtemp=24;
		int currenttemp;
		try {
			System.out.println("Enter current temperature of room :");
			currenttemp=sc.nextInt();
			if(roomtemp>currenttemp) {
				System.out.println("Temperature is controlled!");
			
			}else
			throw new MyFirstException("Room temp increased!");	
		}
		catch(MyFirstException f){
			System.out.println(f.getMessage());
			System.out.println("The Ac is on now.....");
			//f.printStackTrace();
			
		}
		
	}

}
