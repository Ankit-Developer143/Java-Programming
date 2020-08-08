package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Java_FileReader {
	public static void main(String[] args) throws IOException {
		String str = "hello";
		char  [] array = new char[100];
		try {
			
			//use to read Files
			FileReader input = new FileReader("Both.txt");
			
			input.read(array);
			System.out.println(array);
			
			input.close();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
//op:-First We Read And The Write
