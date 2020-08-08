package IO;

import java.io.BufferedReader;
import java.io.FileReader;

public class Java_BufferedReader {
	public static void main(String[] args) {

		// Creates an array of character
		char[] array = new char[100];

		try {
			// Creates a FileReader
			FileReader file = new FileReader("output.txt");

			// Creates a BufferedReader
			BufferedReader input = new BufferedReader(file);

			// Reads characters
			input.read(array);

			System.out.println("Data in the file: ");
			System.out.println(array);

			// Closes the reader
			input.close();
		}

		catch (Exception e) {
			e.getStackTrace();
		}
	}

}
/*
 * op:-Data in the file:
 *  This is Data in The Output File
 */