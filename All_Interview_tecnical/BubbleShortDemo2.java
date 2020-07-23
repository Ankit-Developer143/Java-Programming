package All_Interview_tecnical;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleShortDemo2 {
	public static void main(String[] args) {
		int num,i ,temp ;
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Array Length");
		num=sc.nextInt();
		
		int array[]=new int[num];
		
		System.out.println("Enter The Arraay Element");
		 for( i=0;i<num;i++) 
			 array[i]=sc.nextInt();
		 for(i=0;i<array.length;i++) {
			 for(int j=0;j<array.length-1;j++) {
				 if(array[j]>array[j+1]) {
					 temp=array[j];
					 array[j]=array[j+1];
					 array[j+1]=temp;
				 }
			 }
		 }
		 System.out.println("Sorted Array:"+Arrays.toString(array));
		 
		
		
		
	}

}
