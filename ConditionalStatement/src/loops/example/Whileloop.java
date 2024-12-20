package loops.example;

public class Whileloop {
	public static void main(String[] args) {
		int i=1;
		while(i<=5) {
			if(i%2==0) {
				System.out.println(i+" is even number");
			}else
				System.out.println(i+" is odd number");
			i++;

		}
		int j=1;
		int k=5;
		int l=1;
		while(j<=k) {
			l*=j;
			j++;
		}
		System.out.println("Factorial of "+k+" is="+l);
		char alphabets='A';
		while(alphabets<='Z') {
			System.out.println(alphabets);
			alphabets++;

		}
		int mul=1;
		int table=5;
		while(mul<=10) {
			System.out.println(table+"X"+mul+"="+(table*mul));
			mul++;
		}
		int m=1;
		int add=0;
		while(m<150) {
			m++;
			if(m%2==0) {
				System.out.println("Even number : "+m);
				add+=m;
			}

		}
		System.out.println("Addition of even number is : "+add);

		int n=0;
		int add1=0;
		while(n<150) {
			n++;
			if(n%2!=0) {
				System.out.println("Odd number : "+n);
				add1+=n;
			}

		}
		System.out.println("Addition of Odd number is : "+add1);

		int num1=10;
		int num2=30;
		int range=0;
		while(num1<=num2) {
			range++;
			System.out.println(num1);
			num1++;
		}
		System.out.println("The range between two number is : "+range);

		int o=1;
		int count=0;
		while(o<150) {
			o++;
			if(o%2==0) {
				System.out.println("Even number : "+o);
				count++;
			}

		}
		System.out.println("Count of even number is : "+count);

		int p=0;
		int count1=0;
		while(p<150) {
			p++;
			if(p%2!=0) {
				System.out.println("Odd number : "+p);
				count1++;
			}

		}
		System.out.println("Count of Odd number is : "+count1);
		
		//Program on Palindrome number 
				int numm1=454;
				int sum1=0;
				int temp1=numm1;

				while(numm1>0) {
					sum1=sum1*10+numm1%10;
					numm1/=10;

				}if(temp1==sum1) {
					System.out.println(temp1+" is a palindrome number");
				}
				else
					System.out.println(temp1+" is not a palindrome number");

				//Program on Prime number using if else
				int numm2=14;
				if(numm2%2==0) {
					if(numm2+1>numm2) {
						System.out.println(numm2+" is not prime number");
					}
				}else
					System.out.println(numm2+" is prime number");

				//Program to check prime number using loop
				int numm3=18;
				int sum3=0;
				for(int i1=2;i1<=numm3;i1++) {
					if(numm3%2==0) {
						sum3++;
					}
				}if(sum3==0) {
					System.out.println(numm3+" is prime number");
				}else
					System.out.println(numm3+" is not prime number");

				//Program on armstrong number 
				int numm4=154;
				int sum4=0;
				int x;
				int temp2=numm4;
				while(numm4!=0) {
					x=numm4%10;
					sum4=sum4+x*x*x;
					numm4/=10;
				}
				if(temp2==sum4) {
					System.out.println(temp2+" is armstrong number");
				}else
					System.out.println(temp2+" is not armstrong number");

				//Program on addition of digit one by one
				int numm5=1366;
				int sum5=0;
				int y;
				while(numm5!=0) {
					y=numm5%10;
					numm5/=10;
					sum5=sum5+y;
				}
				System.out.println("sum of digit is :"+sum5);

				int number=13;
				boolean flag=false;
				for(int i1=2;i1<number;i1++) {
					if(number%i1==0) {
						flag=true;
						break;
					}
				}
				if(flag) 
					System.out.println("not prime");
				else
					System.out.println("prime");
				//
				//		//prime number
				//		int prime=18;
				//		for(int i=2;i<prime;i++) {
				//			if(prime%i==0) {
				//				System.out.println("not prime number");
				//				System.exit(1);
				//			}
				//		}
				//		System.out.println("prime number");

				//reverse number and plaindrome
				//		int value=131;
				//		int sample=0;
				//		int reverse=0;
				//		int copy=value;
				//		while(value>0) {
				//			sample=sample*10+value%10;
				//			value/=10;
				//			reverse=sample;	
				//		}
				//		System.out.println(reverse);
				//		if(reverse==copy) {
				//			System.out.println("Palindrome");
				//		}else
				//			System.out.println("Not Palindrome");

				int sep=1444567;
				int met=0;
				int sep1=0;
				while(sep>0) {
					met=sep%10;
					sep/=10;
					sep1=sep1+met;
				}
				System.out.println(sep1);
				

				for(int row=0;row<=9;row++) {
					for(int col=1;col<=row;col++) {

						System.out.print(col+" ");
					}
					System.out.println();
					
					
				}


				int n1=0,n2=1,n3,fibo=10;
				//System.out.print(n1+" "+n2);
				for(int i1=0;i1<fibo;++i1)   
				{    
					n3=n1+n2;    
					System.out.print(" "+n3);    
					n1=n2;    
					n2=n3;    
				}









	}

}
