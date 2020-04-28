package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OS_Write_Byte {
public static void main(String[] args) throws IOException {
	
	try {
		FileOutputStream f=new FileOutputStream("file.txt");
		f.write(10);
		f.close();
		System.out.println("Succefully....");
		
		
		
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
