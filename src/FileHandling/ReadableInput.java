package FileHandling;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadableInput {
	public static void main(String[] args) throws IOException {
		try {
			FileReader f=new FileReader("Any.txt");
			char c[]=new char[100];
			
			f.read(c);
			
			
			for(int i=0;i<c.length;i++) {
				System.out.print(c[i]);
				
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		}
		
	}
	

}
