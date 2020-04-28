package FileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriterDemo {
	public static void main(String[] args) {
	try {
		FileWriter fr=new FileWriter("Other.txt");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Text.........");
		String s=sc.next();
		
		
		fr.write(s);
		System.out.println("Save Succefully");
		fr.flush();
		fr.close();
		
		
		
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
