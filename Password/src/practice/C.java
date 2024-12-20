package practice;

public class C {
	static int i=10;
	C() {
		System.out.println("This is constructor");
	}
	{
		System.out.println("This is non static block ");
	}
	static {
		System.out.println("This is static block ");
	}
	public static void main(String[] args) {
		C call=new C();
		C call2=new C();
		
		
	}

}
