package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OS_write_String {
	public static void main(String[] args) throws IOException {
		String s="Ankit Singh";
		
		try {
			FileOutputStream f=new FileOutputStream("file.txt");
			byte[] b=s.getBytes();
			f.write(b);
		
			f.close();
			System.out.println("Succefully Write.....");
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
