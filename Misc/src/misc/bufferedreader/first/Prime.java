package misc.bufferedreader.first;

public class Prime {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			int count=0;
			for(int j=i;j>=1;j--) {
				if(i%j==0) {
					count=count+1;
				}
			}
			if(count==2) {
				System.out.println(i);
			}
		}
		int num=7;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				System.out.println(num+" is not prime");
				break;
			}else
				System.out.println(num+" is prime");
			break;

			
		}
	

	}

}
