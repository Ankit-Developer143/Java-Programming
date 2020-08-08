package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Java_OutputStreamWriter {
	public static void main(String[] args) throws IOException {
	String str = "This is The String File";
	
	try {
		FileOutputStream file = new FileOutputStream("OutputStream.txt");
		
		OutputStreamWriter output = new OutputStreamWriter(file);
		
		output.append("HELLO");
		
		output.write(str);
		
		//optional forces to write all the data present in the writer to the corresponding destination
		//op:-java.io.OutputStreamWriter@15db9742
		output.flush();
		System.out.println(output);
		output.close();
		
		
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
/*op:-  HELLOThis is The String File */
