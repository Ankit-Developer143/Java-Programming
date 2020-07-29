package edabit;

public class Char_to_ASCII {
	public static int ctoa(char c) {
		int result = (int) c;
		return result;

	}

	public static void main(String[] args) {
		Char_to_ASCII c = new Char_to_ASCII();
		System.out.println(c.ctoa('A'));

	}

}
