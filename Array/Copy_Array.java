package Array;

import java.util.Arrays;

public class Copy_Array {
	public static void main(String[] args) {
		int [] num= {1,2,3,4,5,6};
		int [] number=num;
		
		//num[0]=-1; inserted values 
		
		for(int numbers:number) {
			System.out.print(numbers+ " ,");
			//System.out.println(Arrays.toString(number));
		}
		
		
	}

}
