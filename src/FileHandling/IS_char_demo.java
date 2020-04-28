package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IS_char_demo {
	public static void main(String[] args) throws IOException {
		try {
			FileInputStream fin=new FileInputStream("file.txt");
			//int i=fin.read(); read single character
			 int i=0;
			while(( i=fin.read())!=-1){    
			System.out.print((char)i);
		
			
			 }
				fin.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
