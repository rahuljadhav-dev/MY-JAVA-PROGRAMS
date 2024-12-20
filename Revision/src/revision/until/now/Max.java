package revision.until.now;

public class Max {
	public static void main(String[] args)throws Exception {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		
		int max=(a>b) ? a:b;
		int min=(a<b) ? a:b;
		System.out.println(max);
		System.out.println(min);
	}

}
