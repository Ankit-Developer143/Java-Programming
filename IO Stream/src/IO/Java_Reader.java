package IO;

import java.io.FileReader;
import java.io.Reader;

public class Java_Reader {
	public static void main(String[] args) {
		char[] array = new char[100];
		try {
			// Create reader Using File Reader
			Reader input = new FileReader("text1.txt");

			System.out.println("Is there Data in the Stream :" + input.ready());// true

			// read Character
			input.read(array);

			// Character Store in Array And Then  Read It
			System.out.println(array);// op:- This is the text

			// Close Reader
			input.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

/*
 * Notes :-
 *  input.read(); // to read data from the reader 
 *  input.close(); // to close the reader
 * 
 * 
 */
