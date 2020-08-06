package edabit;

public class reverse_Coding {
public static void mysteryFunc(int[] arr, int num) {
	
	for(int i = 0; i <arr.length; i++){
		arr[i] =arr[i]%2;
		
		System.out.println(arr[i]);
	}
	}
public static void main(String[] args) {
	int []arr = {5, 7, 8, 2, 1};
  
	reverse_Coding r = new reverse_Coding();
	r.mysteryFunc(arr, 2);
}
}
/*
 * op:- 1 1 0 0 1
 */
