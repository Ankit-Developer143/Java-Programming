package FileHandling;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		
		
		try {
			FileOutputStream  f=new FileOutputStream("Other.txt");
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Value.......");
			String s=sc.nextLine();
			
			f.write(s.getBytes());
			System.out.println("Succefully........");
			
			
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	
		
		
	}

}
