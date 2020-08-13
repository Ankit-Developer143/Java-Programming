package edabit;

import java.util.Arrays;

public class Smallest_Number_in_Array {
	 public static int findSmallestInt(int[] args) {
		//Arrays.sort(args);
		int result  = args[0];
		for (int i = 1; i<args.length;i++) {
			if(args[i]<result){
				result = args[i];
			}
			
			
		}
		return result;
	    }
	public static void main(String[] args) {
		int[] arr = {34, 92,2,1, 88, 2,80};
		
		Smallest_Number_in_Array s = new Smallest_Number_in_Array();
		System.out.println(s.findSmallestInt(arr));
		
	}

}
