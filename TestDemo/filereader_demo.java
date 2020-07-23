package TestDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class filereader_demo {
	public static void main(String[] args) throws IOException {
		try {
			FileReader fr=new FileReader("Other.txt");
			
			char ch[]=new char[100];
			
			fr.read(ch);
			
			for(int i=0;i<ch.length;i++) {
				System.out.print(ch[i]);
				
			
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
