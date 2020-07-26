package edabit;

import java.util.Arrays;

public class find_The_Index {
	 public static int search(int arr[], int item) {
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] == item) {
				return i;
				
			}
		}
		return -1;
			
		}
	public static void main(String[] args) {
		int arr[] = {1,3,5,7,9};
		
		find_The_Index f = new find_The_Index();
		 System.out.println(f.search(arr, 11));
		
	}

}
