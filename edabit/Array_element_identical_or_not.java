package edabit;
/*Create a function that takes in an array (slot machine outcome) and returns true if all elements in the array are identical, and false otherwise. 
The array will contain 4 elements.
*/



public class Array_element_identical_or_not {
	public static boolean testJackpot(String[] result) {
		for (int i = 1 ; i < result.length ; i++) {
			if (result[i] != result[i-1]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String result[] = {"abc", "abc", "abc", "abc"};
		
		Array_element_identical_or_not a = new Array_element_identical_or_not();
		System.out.println(a.testJackpot(result));
		
	}

}
