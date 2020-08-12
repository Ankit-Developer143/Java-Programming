package edabit;

import java.util.Arrays;

public class Largest_And_Smallest_Array {
	public static int difference(int[] nums) {
		int result = 0;
		Arrays.sort(nums);

		int a = Math.max(nums[0], nums[nums.length - 1]);
		int b = Math.min(nums[0], nums[nums.length - 1]);
		result = Math.abs(a - b);
		return result;

	}

	public static void main(String[] args) {
		int nums[] = { -3, 4, -9, -1, -2, 15};
		Largest_And_Smallest_Array l = new Largest_And_Smallest_Array();

		System.out.println(l.difference(nums));
	}//24

}


//Another Way

/*
 * public static int difference(int[] nums) { 
 * Arrays.sort(nums); 
 * return nums[nums.length - 1] - nums[0]; }
 */
