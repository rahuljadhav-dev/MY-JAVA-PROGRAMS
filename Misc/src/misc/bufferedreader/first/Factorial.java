package misc.bufferedreader.first;

public class Factorial {
	public static void main(String[] args) {
		int fact=4;
		int sum=1;
		for(int i=1;i<=fact;i++) {
			sum*=i;
		}
		System.out.println(sum);
	}

}
