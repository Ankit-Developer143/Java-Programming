package FileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterDemo {
	public static void main(String[] args) {
		try {
			FileWriter f=new FileWriter("Any.txt");
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the text");
			String s=sc.nextLine();
			
			f.write(s);
			f.flush();
			
			f.close();
			System.out.println("Written Succefully........");
			
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
