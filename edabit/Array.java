package edabit;
public class Array {
	public static void main(String[] args) {
		int result = 1;
		int[][][] arr = { { { 2, 3,2 }, { 6, 6,7 } , { 1, 2,1 } } };
		 for (int[][] array2D: arr) {
			 System.out.println(array2D);
	            for (int[] array1D: array2D) {
	                for(int item: array1D) {
	                     result = result*item;
	                  
	                     
	                }
	                System.out.println(result);
	            }
	        }
	}

}
