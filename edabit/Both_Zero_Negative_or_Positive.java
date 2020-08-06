package edabit;

public class Both_Zero_Negative_or_Positive {
	public static boolean both(int n1,int n2) {
		if ((n1 == 0 && n2 == 0) || (n1 > 0 && n2 > 0) || (n1 < 0 && n2 < 0)){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Both_Zero_Negative_or_Positive b = new Both_Zero_Negative_or_Positive();
				System.out.println(b.both(-1, 2));
		
	}

}
