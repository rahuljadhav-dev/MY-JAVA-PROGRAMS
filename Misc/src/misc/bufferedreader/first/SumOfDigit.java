package misc.bufferedreader.first;

public class SumOfDigit {
	public static void main(String[] args) {
		int num=124;
		int temp=0;
		int sum=0;
		while(num>0) {
			temp=num%10;
			num/=10;
			sum+=temp;
			
		}
		System.out.println(sum);
	}

}
