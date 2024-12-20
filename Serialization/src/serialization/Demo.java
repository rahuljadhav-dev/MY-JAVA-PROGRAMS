package serialization;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Demo {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos=new FileOutputStream("E:\\ABC.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		Academy a=new Academy();
		a.name="JBK";
		a.address="Chinchwad";
		
		oos.writeObject(a);
		System.out.println("Object Serialized!");
	}

}
