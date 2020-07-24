package edabit;

public class Case_Insensitive_Comparison {
	public static boolean match(String str1, String str2) {
		/*
		 * if(str1.equalsIgnoreCase(str2)) { 
		 * return true; 
		 * } else {
		 *  return false; 
		 *  }
		 */
		boolean result = str1.equalsIgnoreCase(str2)? true:false;
		return result;

	}

	public static void main(String[] args) {
		Case_Insensitive_Comparison c = new Case_Insensitive_Comparison();
		System.out.println(c.match("ANkit", "Ankit"));

	}
}
