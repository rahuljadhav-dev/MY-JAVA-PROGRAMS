package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Read {
	public static void main(String[] args) throws Exception{
		FileInputStream fis=new FileInputStream("E:\\ABC.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Academy obj= (Academy)ois.readObject();
		System.out.println(obj.name);
		System.out.println(obj.address);
		
	}

}
