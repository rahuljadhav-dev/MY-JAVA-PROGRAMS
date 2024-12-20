package loops.example;

public class Prime {
	public static void main(String[] args) {
		int range=100;
		int count = 0;
		for(int i=1;i<range;i++) {
			count=0;
			System.out.println(count);
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
					System.out.println(count);
				}
			}
			if(count==2) {
				System.out.println(i);
			}
		}

	}
}


