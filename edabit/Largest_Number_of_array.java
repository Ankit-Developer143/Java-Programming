package edabit;

import java.util.Arrays;

public class Largest_Number_of_array {
public static int findLargestNum(int[] inputArray) {
	Arrays.sort(inputArray);
	 int maxValue = 0; 
	    for(int i=1;i < inputArray.length;i++){ 
	      if(inputArray[i] > maxValue){ 
	         maxValue = inputArray[i]; 
	      } 
	    } 
	    return maxValue; 
	  }
		


	public static void main(String[] args) {
		int nums[] = { 8,4, 5, 1, 3};
		
		Largest_Number_of_array l = new Largest_Number_of_array();
		
		System.out.println(l.findLargestNum(nums));
	}

}
