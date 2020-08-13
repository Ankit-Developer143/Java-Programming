package edabit;

public class Equality {
	public static boolean checkEquality(Object a, Object b) {
		if (a == null && b == null)
			return true;
		
		if (a != null && b != null)
			return a.equals(b);
			
		return false;
	}
	public static void main(String[] args) {
		Equality e = new Equality();
		System.out.println(e.checkEquality(1, true));
	}

}
//false