package TestDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamdeom {
	public static void main(String[] args) throws IOException {
		
	
	
	
		FileInputStream fi=new FileInputStream("Any.txt");
		
		
		byte b[]=new byte[5];
		fi.read(b);
		
		for(int i=0;i<b.length;i++) {
			System.out.print((char)b[i]);
		}
		
		
	
	

}
}
