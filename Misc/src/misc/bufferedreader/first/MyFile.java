package misc.bufferedreader.first;

import java.io.File;
import java.io.IOException;

public class MyFile {
	public static void main(String[] args) throws Exception {
		File f=new File("E:\\MyFile.txt");
		f.createNewFile();
		f.canWrite();
		
		System.out.println("File Created");
	}

}
