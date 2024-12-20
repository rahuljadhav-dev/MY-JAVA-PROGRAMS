package serialization.task3;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class Readcar {
	public static void main(String[] args) throws Exception{
		FileInputStream f=new FileInputStream("E:\\cars.txt");
		ObjectInputStream o=new ObjectInputStream(f);
		Car obj=(Car)o.readObject();
		System.out.println(obj.name);
		System.out.println(obj.model);
		System.out.println(obj.price);
		Car obj1=(Car)o.readObject();
		System.out.println(obj1.name);
		System.out.println(obj1.model);
		System.out.println(obj1.price);
		Car obj2=(Car)o.readObject();
		System.out.println(obj2.name);
		System.out.println(obj2.model);
		System.out.println(obj2.price);
		
		
		
		
	}

}
