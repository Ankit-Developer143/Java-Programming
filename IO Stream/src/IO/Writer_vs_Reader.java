package IO;
import java.io.*;

public class Writer_vs_Reader {
	public static void main(String[] args) {
		
		//Reader
		char []array = new char[100];
		
		
		
		String data = "First We Read And The Write";
		try {
			Writer r = new FileWriter("Both.txt");
			
			r.write(data);
			r.close();
			
			System.out.println("File Created...");
			
			
			//Reader
			
			Reader input = new FileReader("Both.txt");
			
			input.read(array);
			System.out.println(array);
			
			System.out.println("File Read Succesfully...");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}

/* op 
 * File Created...
   First We Read And The Write
   File Read Succesfully...*/
