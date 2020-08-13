package edabit;

public class MultiDevision {
	public static boolean abcmath(int a, int b, int c) {
		int result = (int) Math.pow(a, b);
		if(result%c==0) {
			return true;
		}
		return false;
		
	  }
	public static void main(String[] args) {
		MultiDevision m = new MultiDevision();
		System.out.println(m.abcmath(42, 5, 10));
	}//false
	
	// 42+42 = 84,84+84 = 168,168+168 = 336,336+336 = 672, 672+672 = 1344
	// 1344 is not divisible by 10 return false

}
