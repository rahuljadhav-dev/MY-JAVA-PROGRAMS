package misc.bufferedreader.first;

import java.util.Arrays;

public class Reverse {
	public static void main(String[] args) {
		String name="rahul";
		char[]c=name.toCharArray();
		Arrays.sort(c);
		String sorted=new String(c);
		System.out.println(sorted);
//		int left=0;
//		int right=name.length()-1;
		
//		while(left<right) {
//			char temp=c[left];
//			c[left]=c[right];
//			c[right]=temp;
//			left++;
//			right--;
//			
//		}
//		String rev=new String(c);
//		System.out.println("Reversed String :"+rev);
	
		

	}


}
