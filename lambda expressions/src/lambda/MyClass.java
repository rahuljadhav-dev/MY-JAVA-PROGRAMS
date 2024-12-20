package lambda;

public class MyClass {
	public static void main(String[] args) {
//		Xyz i=new Xyz() {
//
//			@Override
//			public void num(int a, int b) {
//				System.out.println(a+b);
//				
//			}
//			
//		};
//		i.num(10, 20);
//		
		Xyz i1=(a,b)->System.out.println(a+b);
		i1.num(45, 40);
	}

}
