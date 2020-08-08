package IO;

import java.io.*;

//Same As StringWriter

public class Java_StringReader {
	public static void main(String[] args) {
		String data = "This is the text read from StringReader.";

		// Create a character array
		char[] array = new char[100];

		try {
			// Create a StringReader
			StringReader input = new StringReader(data);

			// Use the read method
			input.read(array);
			System.out.println("Data read from the string:");
			System.out.println(array);

			input.close();
		} catch (Exception e) {
			e.getStackTrace();
		}

	}
}
/*
 * op:- Data read from the string:
 * This is the text read from StringReader.
 */