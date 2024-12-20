package demo.info;

public class Demo {
	public static void main(String[] args) {
		Calculator call=new Calculator();
		System.out.println("This is parameterized method :");
		call.Add(15, 45);
		call.Div(345, 7);
		call.Min(65, 3);
		call.Mod(67, 5);
		call.Mul(34, 56);
		
		Calculator2 call2=new Calculator2();
		System.out.println("This is non-parameterized method :");
		call2.Add();
		call2.Div();
		call2.Min();
		call2.Mod();
		call2.Mul();


	}

}
