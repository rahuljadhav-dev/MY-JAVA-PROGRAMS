package misc.bufferedreader.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo1 {
	public static void main(String[] args) throws Exception {
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter something :");
		String value=b.readLine();
		int a=Integer.parseInt(value);
		System.out.println(a);
	}

}
