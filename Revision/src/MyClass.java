
public class MyClass {
	public static void main(String[] args) {
		for(int i=1;i<5;i++) {
			for(int j=1;j<5;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		int range=10;
		int num1=0;
		int num2=1;
		int num3;
		System.out.println(num1+"\n"+""+num2);
		for(int i=1;i<range;i++) {
			num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.println(num3);
			
		}
	}

}
