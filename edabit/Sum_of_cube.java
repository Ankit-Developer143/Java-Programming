package edabit;

public class Sum_of_cube {
public static int sumOfCubes(int[] nums) {
	int res = 0;
	for (int i = 0; i < nums.length; i++) {
		res   += Math.pow(nums[i], 3);
	}
	return res;
}
	public static void main(String[] args) {
		Sum_of_cube s = new Sum_of_cube();
		int arr[] = {3, 4, 5};
		System.out.println(s.sumOfCubes(arr));
	}

}
//op:-216
  	