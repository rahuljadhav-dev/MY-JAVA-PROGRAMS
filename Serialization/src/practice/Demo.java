package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//Serialization
		FileOutputStream fos=new FileOutputStream("E:\\testcase.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Student s=new Student();
		s.name="rahul";
		s.age=24;
		oos.writeObject(s);
		System.out.println("object serialized");
		
		//De-serialization
		FileInputStream ff=new FileInputStream("E:\\testcase.txt");
		ObjectInputStream o=new ObjectInputStream(ff);
		Student ss=(Student)o.readObject();
		System.out.println(ss.name);
		System.out.println(ss.age);
		
		
		
	}

}
