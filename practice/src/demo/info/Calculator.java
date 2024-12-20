package demo.info;
public class Calculator {

	int sum;
	int mul;
	int sub;
	int div;
	int mod;
	
	public void Add(int a, int b) {
		sum=a+b;
		System.out.println("Addition :"+sum+"\n");
	}
	
	public void Min(int a, int b) {
		sub=a-b;
		System.out.println("Substraction :"+sub+"\n");
	}
	
	public void Mul(int a, int b) {
		mul=a*b;
		System.out.println("Multiplication :"+mul+"\n");
	}
	
	public void Div(int a, int b) {
		div=a/b;
		System.out.println("Division :"+div+"\n");
	}
	
	public void Mod(int a, int b) {
		mod=a%b;
		System.out.println("Modulo :"+mod+"\n");
	}



}
