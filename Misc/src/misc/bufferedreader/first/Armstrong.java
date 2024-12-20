package misc.bufferedreader.first;

public class Armstrong {
	public static void main(String[] args) {
		int number=155;
		int temp1=0;
		int temp2=number;
		
		int check=0;
		while(number>0) {
			temp1=number%10;
			number/=10;
			check+=temp1*temp1*temp1;
		}
		if(check==temp2) {
			System.out.println(temp2+" Is a armstrong number");
		}else
		System.out.println(temp2+" Is not armstrong number ");
		
	}

}
