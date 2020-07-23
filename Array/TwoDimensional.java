package Array;
//print two dimensional array in different for way

import java.util.Arrays;

public class TwoDimensional {
	public static void main(String[] args) {
		int arr[][]= {{1,2,3,4},{3,2,1,5}};
		/*for(int[] innerarray:arr) {
			for(int a:innerarray) {
				System.out.println(a);
				}*/
		
				for(int i=0;i<arr.length;i++) {
					for(int j=0;j<arr[i].length;j++) {
						System.out.println(arr[i][j]);
					}
				}
			
		}
		
	}


