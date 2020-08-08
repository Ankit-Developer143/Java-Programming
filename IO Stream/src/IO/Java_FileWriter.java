package IO;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Java_FileWriter {
	public static void main(String[] args) {
	
		
		try {
			String str = "This is The OutputFile";
		
			
			System.out.println("Write Successfully..");
			FileWriter f  = new FileWriter("User.txt");
			
			f.write(str);
			
			
			f.flush();
			f.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
