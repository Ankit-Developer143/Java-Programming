package IO;

import java.io.*;

public class Java_InputStreamReader {
	public static void main(String[] args) throws IOException {
		char[] array = new char[100];
		try {
			// Create FileInputString
			FileInputStream file = new FileInputStream("text1.txt");

			// Create InputStreamReader for read The file
			InputStreamReader input = new InputStreamReader(file);

			// Check Ready To Read Are Not
			System.out.println(input.ready()); // true

			input.skip(5);
			// After Skipping 5 Character
			// op:-is the text

			// Reads characters from the file
			input.read(array);
			System.out.println(array);

			System.out.println(input);

			// close
			input.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

//op:-This is The Text
