package edabit;

public class Sum_Of_Array_even {
public static int minimumRemovals(int[] arr) {
	int result = 0;
	for(int i = 0; i <arr.length; i++){
		result +=arr[i];
	}
		if(result%2==0) {
			return 0;
		}
		
	return 1;
	}
public static void main(String[] args) {
	int []arr = {5, 7, 9, 12};
	System.out.println(Sum_Of_Array_even.minimumRemovals(arr));;
}

}
