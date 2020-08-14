package edabit;

public class Array_Countdown {
	public static  int[] countdown(int start) {
		int[]  result = new int[start+1];
		for (int i = start-1 ; i >= 0 ; i--) {
			
			result[start-i] = i;
			
		System.out.println(result);
		}
		return result;
		
	
}
public static void main(String[] args) {
	
	Array_Countdown arr = new Array_Countdown();
	System.out.println(arr.countdown(5));
}

}//op:-5,4,3,2,1,0
