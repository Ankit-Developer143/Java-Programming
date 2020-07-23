package TestDemo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filewriter_Demo {
	public static void main(String[] args) {
		try {
			FileWriter f=new FileWriter("other.txt");
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the Some Text");
		    String s=sc.next();
		
		    f.write(s);
		    f.close();
		    System.out.println("Succefully......");
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
