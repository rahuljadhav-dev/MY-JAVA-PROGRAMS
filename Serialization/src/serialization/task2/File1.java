package serialization.task2;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class File1 {
	public static void main(String[] args) throws Exception{
		FileOutputStream f=new FileOutputStream("E:\\ash.pdf");
		ObjectOutputStream o=new ObjectOutputStream(f);
		Details d=new Details();
		d.name="Rahul";
		d.age=24;
		d.salary=100000;
		d.gender="Male";
		o.writeObject(d);
		System.out.println("object serialized");
		
		
		
	}


}
