package edabit;

public class Condition_Print {
	public static String helloWorld(int num) {
		// turnery Operators
		// String result =(num == 3) ? "hello":(num==5)? "world":"hello world";
		// return result;

		if (num == 3) {
			return "Hello";

		} else if (num == 5) {
			return "World";

		} else {
			return "Hello World";
		}
	}

	public static void main(String[] args) {
		Condition_Print c = new Condition_Print();
		System.out.println(c.helloWorld(15));

	}

}
