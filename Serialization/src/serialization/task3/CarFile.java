package serialization.task3;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class CarFile {
	public static void main(String[] args) throws Exception{
		FileOutputStream f=new FileOutputStream("E:\\cars.txt");
		ObjectOutputStream o=new ObjectOutputStream(f);
		Car c=new Car("tata-xx","tata",10);
		Car d=new Car("nano-xy","tata",5);
		Car e=new Car("baleno","suzuki",10);
		o.writeObject(c);
		o.writeObject(d);
		o.writeObject(e);
		System.out.println("Object serialized!");

		
		
	}

}
