package practice;

public class B {
	static int i=10;
	int b=20;
	void display() {
		System.out.println(i);
	
	}
	
	static void show() {
		System.out.println(i);
	
	}
	public static void main(String[] args) {
		System.out.println(B.i);
		B.show();
	
		
	}
}
