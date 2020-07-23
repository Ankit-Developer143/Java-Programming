package TestDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutput_Demo {
public static void main(String[] args) throws IOException {
	try {
		FileOutputStream f=new FileOutputStream("Any.txt");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Some Text");
		String s=sc.next();
		
		f.write(s.getBytes());//Convert Bytes
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Succefully............");
	
	
}

}
