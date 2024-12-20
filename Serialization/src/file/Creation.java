package file;
import java.io.*;

public class Creation {
	public static void main(String[] args) throws IOException {
		File f=new File("E:\\rj.txt");
		f.createNewFile();
		FileWriter ff=new FileWriter(f);
		ff.write("Hey buddy i am rahul jadhav i will writing this code ");
		ff.close();
		
		FileReader f1=new FileReader("E:\\rj.pdf");
		int ch=f1.read();
		while(ch!=-1) {
			System.out.print((char)ch);
			ch=f1.read();
		}
		f1.close();
		
		
		
	}

}
