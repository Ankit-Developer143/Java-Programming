package IO;

import java.io.*;

public class InputStreamReader_Vs_InputBufferedReader {
	public static void main(String[] args) throws IOException {
		String phone_Model;
		double phone_Price;

		InputStreamReader IS = new InputStreamReader(System.in);

		BufferedReader BR = new BufferedReader(IS);

		System.out.println("Enter Your Phone Model");
		phone_Model = BR.readLine();

		System.out.println("Enter Your Phone Price");
		phone_Price = Integer.parseInt(BR.readLine());

		System.out.println("You Won " + phone_Model + " The Price Of " + phone_Price);

		// op:-You Won Apple Iphone The Price Of 7400.0

	}

}
