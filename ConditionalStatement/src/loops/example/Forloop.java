package loops.example;

public class Forloop {
	public static void main(String[] args) {
		//Que.1-Print a table of a number	
		System.out.println("The table is given below :");
		int number=17;
		for(int i=1;i<=10;i++) {
			System.out.println(number+"X"+i+"="+(number*i));
		}
		
		//Que.2-Factorial number
		System.out.println("The factorial number :");
		int a=1;
		for(int j=1;j<=9;j++) {
			a*=j;   // a=a*j
		}
		System.out.println(a);
		
		//Que.3-Print range of two number	
		System.out.println("Range of two numbers :");
		int b=1;
		int c=4;
		int range=0;
		for(int k=1;k<c;k++) {
			range++;
			//System.out.println(k);
		}
		System.out.println("The range of "+b+" to "+c+" is "+"="+range);
		
		//Que.4-Print alphabet A to Z
		System.out.println("A to Z alphabets :");
		for(char l='A';l<='Z';l++) {
			System.out.println(l);
		}
		
		//Que.5-1 to 50 Even numbers and add the even numbers
		System.out.println("1 to 50 Even numbers and add the even numbers :");
		int add2=0;
		for(int m=2;m<=50;m+=2) {
			add2+=m;
			System.out.println(m);
		}
		System.out.println("addition of even numbers is "+"="+add2);
		
		//Que.6-1 to 25 Odd numbers and add the odd numbers
		System.out.println("1 to 25 Odd numbers and add the odd numbers");
		int add3=0;
		for(int n=1;n<=25;n+=2) {
			add3+=n;
			System.out.println(n);
		}
		System.out.println("Addition of all odd numbers is "+"="+add3);
		//Que.7
		
		int add4=0;
		for(int o=1;o<=25;o+=2) {
			add4++;;
			System.out.println(o+"-"+add4);
		}
		System.out.println("Count of odd number is "+"="+add4);
		
		//Que.8
		int add5=0;
		for(int p=2;p<=50;p+=2) {
				add5++;
				System.out.println(p+"-"+add5);
			
		}
		System.out.println("Count of even number is "+"="+add5);
		
		int a1=21;
		int b1=35;
		if(a1<b1) {
			for(int i=a1;i<=b1;i++) {
				System.out.println(i);
			}
		}else
			for(int i=a1;i>=b1;i--) {
				System.out.println(i);
			}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("#");
			}
			System.out.println();
			
		}
		char ch='a';
		int n=10;
		for(int k=1;k<=n;k++) {
			System.out.println(ch+" ");
		}
		int sum=0;
		for(int l=1;l<=100;l++) {
			sum+=l;
		}
		System.out.println("The sum is: "+sum);
		System.out.println("The Average is: "+sum/100);
		
		int rj=0;
		while(rj<5) {
			System.out.println(rj);
			rj++;
		}
		
		

	}


}
