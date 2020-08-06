package edabit;

public class total_Number_of_Digit {
public static void findDigitAmount(int num) {
	String result = Integer.toString(num);
	System.out.println(result.length());
	
}
	
		
	
public static void main(String[] args) {
	total_Number_of_Digit  t = new total_Number_of_Digit ();
	t.findDigitAmount(12311161);
}

}
