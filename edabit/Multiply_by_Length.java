package edabit;

public class Multiply_by_Length {	
	
	public static int MultiplyByLength(int[] arr1) {
		
		int sum = 0;
		for(int i = 0; i<arr1.length;i++) {
			sum +=arr1[i]*arr1.length;
		}
		return sum;
	}
	public static void main(String[] args) {
		
		
		int [] arr1 =  {2, 3, 1, 0};
		System.out.println(Multiply_by_Length.MultiplyByLength(arr1));
	}
}
			
			
			
	


