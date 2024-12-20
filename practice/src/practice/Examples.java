package practice;

public class Examples {
	public static void main(String[] args) {
		   int n1 = 5, n2 = 10, res;
		   
	        System.out.println("First num: " + n1);
	        System.out.println("Second num: " + n2);
	 
	        // Performing ternary operation
	        res = (n1 < n2) ? (n1 + n2) : (n1 - n2);
	 
	        // Print the largest number
	        System.out.println("Result = " + res);
	        
		int x1=21,sum=0;
		do 
		{
			sum+=x1;
			x1--;
					
		}
		while(x1<=10);
		System.out.println(sum);
		
		short x=100;
		int y=234565454;
		long z=456646372;
		float a=6566.55F;
		float avg =x+y+z+a/4F;
		float add=x+y+z+a;
		float div=avg/add;
		float mul=avg*add;
		x++;
		++y;
		++x;
		y++;
		--z;
		z--;
		boolean condition1=x>y;
		boolean condition2=avg<mul;
		System.out.println(x++);
		System.out.println(x);
		System.out.println(++x);
		System.out.println(x);
		System.out.println(y);
		System.out.println(++y);
		System.out.println(y++);
		System.out.println(z);
		System.out.println(--z);
		System.out.println(z--);
		System.out.println("The Average Is"+"="+ avg);
		System.out.println("The Final Answer is"+"="+ mul);
		System.out.println("Division Is"+"="+ div);
		System.out.println("Pre-Decrement Division is"+"="+ --div);
		System.out.println("X Is Less Than Y So The Answer Is"+"= "+condition1);
		System.out.println(condition2);
		System.out.println("Thank you Rahul!");
		
		int aq=10;
		int bq=12;
		++aq;
		--bq;
		aq--;
		bq++;
		System.out.println(++aq);
		System.out.println(aq);
		System.out.println(bq--);
		System.out.println(--bq);
		System.out.println(bq);
		
		
	}
}
