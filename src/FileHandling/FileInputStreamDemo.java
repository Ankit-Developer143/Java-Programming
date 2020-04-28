package FileHandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		try {
			FileInputStream f=new FileInputStream("Other.txt");
			
			byte ch[]=new byte[100];
			f.read(ch);
			
			for(int i=0;i<ch.length;i++) {
				System.out.print((char)ch[i]);
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
