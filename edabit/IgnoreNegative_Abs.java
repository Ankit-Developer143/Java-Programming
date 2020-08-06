package edabit;

public class IgnoreNegative_Abs {
public static int getAbsSum(int[] nums) {
	int result = 0;
	for(int i = 0; i < nums.length; i++){
		result +=Math.abs(nums[i]); 
	}
	return  result;
	}
		
	
	public static void main(String[] args) {
		int []nums = {2, -1, 4, 8, 10};
		IgnoreNegative_Abs ig = new IgnoreNegative_Abs();
		System.out.println(ig.getAbsSum(nums));
	}//op:-25
	//Math.abs ignore the - Value

}
