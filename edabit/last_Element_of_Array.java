package edabit;

public class last_Element_of_Array {
	public static void main(String[] args) {
		int result = 0;
		int arr[] = {1,2,3,1,2,1};
		for (int i= 0;i<arr.length;i++) {
			result = arr[arr.length-1];
		}
		//System.out.println(arr[arr.length-1]);
		System.out.println(result);
	}

}
