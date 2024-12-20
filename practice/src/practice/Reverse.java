package practice;

public class Reverse {
	public static void main(String[] args) {
		int number=1234;
		int count=0;
	
		while(number>0) {
			count=count*10+number%10;
			number/=10;//number=number/10
			
		}
		System.out.println(count);
		
		int fact=5;
		int a=1;
		for(int i=1;i<=fact;i++) {
			a*=i;//a=a*i
		}
		System.out.println(a);
		
		int x=10;
		int y=20;
		x=x+y;
		y=x-y;
		x=x-y;
		
	
		System.out.println(x);
		System.out.println(y);
	}

}
