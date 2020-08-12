package edabit;

public class Square_and_Cuberoot {
	public static boolean squaresAndCubes(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			if(Math.sqrt(arr[0] )== Math.cbrt(arr[arr.length-1])) {
				return true;
				
			}
		}

		return false;
	}
	public static void main(String[] args) {
		int arr[] = {9, 27};
		Square_and_Cuberoot s = new Square_and_Cuberoot();
		System.out.println(s.squaresAndCubes(arr));
		
	}

}
