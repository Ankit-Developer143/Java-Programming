package IO;

import java.io.*;

public class Java_BufferWriter {
	public static void main(String[] args) {
		
		String str = "This is The New File For BufferWriter";
		
		try {
			FileWriter f = new FileWriter("BufferWriter.txt");
			
			BufferedWriter output = new BufferedWriter(f);
			
			output.write(str);
			
			System.out.println("Created..");
			output.close();
			
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
