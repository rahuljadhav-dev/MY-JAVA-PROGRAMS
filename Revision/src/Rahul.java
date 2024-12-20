import java.util.*;
public class Rahul {
	Scanner sc=new Scanner(System.in);
	public void Days() {
		System.out.println("Enter number :");
		int day=sc.nextInt();
		switch(day) {
		case 1:System.out.println("sun");break;
		case 2:System.out.println("mon");break;
		case 3:System.out.println("tue");break;
		case 4:System.out.println("wed");break;
		case 5:System.out.println("thu");break;
		case 6:System.out.println("fri");break;
		case 7:System.out.println("sat");break;
		default:System.out.println("invalid input!");
		
		}
		Rahul call=new Rahul();
		call.Age(18);
	}
	public void Age(int a) {
		System.out.println("Enter Your age :");
		int age=sc.nextInt();
		if(a<age) {
			System.out.println("You are eligible to vote");
		}else
			System.out.println("You are not eligible to vote");
	}
	public static void main(String[] args) {
		Rahul call=new Rahul();
		call.Days();
		
		
		int range=100;
		int count;
		for(int i=1;i<100;i++) {
			count=0;
			for(int j=1;j<i;j++) {
				count++;
				if(i%j==0) {
					
				}
			
				
			}
			if(count==2) {
				System.out.println("prime"+i);
			}
		}
		
		
	}
}


