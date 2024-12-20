package practice1;

public class A4 {
	public static void main(String[] args) {
		Remote obj=new Remote();
		A1 a1=new A1(obj);//rahul
		A2 a2=new A2(obj);//ashu
		A3 a3=new A3(obj);//shubhs
		a1.setPriority(1);
		a2.setPriority(2);
		a3.setPriority(3);
		a1.start();
		a2.start();
		a3.start();
		
	}

}
