package practice2;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class F1 {
	public static void main(String[] args) throws Exception{
		FileOutputStream fos=new FileOutputStream("E:\\data.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		MyDetails md=new MyDetails();
		md.name="Rahul jadhav";
		md.age=24;
		md.address="704-A wing Arun blu Ravet-pune ";
		md.education="Engineering";
		md.ph=8806675854L;
		oos.writeObject(md);
		System.out.println("Object serialized!");
		
	}

}
