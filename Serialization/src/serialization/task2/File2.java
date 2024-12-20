package serialization.task2;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class File2 {
	public static void main(String[] args) throws Exception{
		FileInputStream ff=new FileInputStream("E:\\Rahul.txt");
		ObjectInputStream o=new ObjectInputStream(ff);
		Details obj= (Details)o.readObject();
		System.out.println(obj.name);
		System.out.println(obj.salary);

		
		
	}

}
