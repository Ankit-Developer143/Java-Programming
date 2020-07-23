package Java_String;

class Compare_Two_Strings {
	public static void main(String[] args) {

		String str1, str2;

		// equals
		str1 = "My Name is Ankit Singh";
		str2 = "My Name is Ankit Singh";
		System.out.println(str1.equals(str2));// true

		// equalsIgnoreCase
		String str3;
		str3 = "my name is ankit singh";
		System.out.println(str1.equalsIgnoreCase(str2)); // true

	}

}
