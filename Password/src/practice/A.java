package practice;

public class A {
	static int a=10;
	static int b=10;

	public static void main(String[] args) {
		A ans=new A();
		System.out.println(ans.a);
		System.out.println(ans.b);

		A ans2=new A();
		int x=ans2.a++;
		System.out.println(x);
		int y=ans2.b++;
		System.out.println(y);

		A ans3=new A();
		int p=ans3.a++;
		System.out.println(p);
		int q=ans3.b++;
		System.out.println(q);

		A ans4=new A();
		int c=ans4.a++;
		System.out.println(c);
		int d=ans4.b++;
		System.out.println(d);
		
		A ans5=new A();
		int e=ans5.a++;
		System.out.println(e);
		int f=ans5.b++;
		System.out.println(f);











	}


}
