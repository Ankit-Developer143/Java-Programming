package edabit;

public class Recursion_Factorial {
	public static int factorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * i;

		}
		return result;
	}

	public static void main(String[] args) {
		Recursion_Factorial r = new Recursion_Factorial();
		System.out.println(r.factorial(5));
	}

}//op:-120
