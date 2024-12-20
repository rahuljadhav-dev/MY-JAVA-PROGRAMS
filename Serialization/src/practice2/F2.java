package practice2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class F2 {
	public static void main(String[] args) throws Exception{
		FileInputStream fis=new FileInputStream("E:\\data.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		MyDetails md=(MyDetails)ois.readObject();
		System.out.println(md.name);
		System.out.println(md.age);
		System.out.println(md.address);
		System.out.println(md.education);
		System.out.println(md.ph);
		
	}

}
