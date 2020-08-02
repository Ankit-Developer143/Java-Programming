package edabit;

import java.util.stream.IntStream;

public class While_Even_number_unique {

	public static int sumEvenNumsInRange(int start, int stop) {
		/*
		 * return IntStream.rangeClosed(start, stop).filter(x -> x % 2 == 0).sum();
		 */
		int sum = 0;
		while (start <= stop) {
			if (start % 2 == 0)
				sum += start;
			start++;

		}
		return sum;
	}

	public static void main(String[] args) {
		While_Even_number_unique e = new While_Even_number_unique();
		System.out.println(e.sumEvenNumsInRange(10, 20));
		// op:-90 (10, 12, 14, 16, 18, 20)

	}

}
