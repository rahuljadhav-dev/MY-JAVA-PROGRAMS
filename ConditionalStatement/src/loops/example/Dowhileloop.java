package loops.example;

public class Dowhileloop {
	public static void main(String[] args) {
		int i=0;
		int count=0;
		int add=0;
		do {
			i++;
			if(i%2==0) {
				System.out.println("Even number :"+i);
				count++;
				add+=i;
			}
		}
		while(i<150);
		System.out.println("Count of even number is :"+count);
		System.out.println("Addition of even number is :"+add);
		
		int j=0;
		int count1=0;
		int add1=0;
		do {
			j++;
			if(j%2!=0) {
				System.out.println("Odd number :"+j);
				count1++;
				add1+=j;
			}
		}
		while(j<150);
		System.out.println("Count of odd number :"+count1);
		System.out.println("Addition of odd number :"+add1);
		
		char alpha='A';
		do {
			System.out.println(alpha);
			alpha++;
		}
		while(alpha<='Z');
		
		int A=10;
		int B=60;
		do {
			System.out.println(A);
			A++;
		}
		while(A<=B);
		
		int F=1;
		int Fact=5;
		int mul=1;
		do {
			F++;
			mul*=F;
		}
		while(F<=Fact);
		System.out.println(mul);
		int x=5665;
		int y=0;
		int tempp=x;
		do {
			y=y*10+x%10;
			x/=10;	
		}
		while(x>0);
		if(tempp==y) {
			System.out.println("Palindrome");
		}else
			System.out.println("Not Palindrome");
	}

	

}
