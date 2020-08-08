package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Java_Writer {
	public static void main(String[] args) throws IOException {
		
		String data = "This is Data in The Output File";
		
		try {
			Writer output = new FileWriter("output.txt");
			
			output.write(data);
			output.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		//op:-new output.txt file Created
		
		
		
		
	}

}
