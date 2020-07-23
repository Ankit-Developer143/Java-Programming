package All_Interview_tecnical;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int temp=0;
		int a[]= {5,4,7,8,9,1};
		
		System.out.println("Before sorting:"+Arrays.toString(a));
		
		for(int i=1;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
			
				if(a[j]>a[j+1]) {
					
					temp=a[j];	
					a[j]=a[j+1];    // 5> 4{j+1} move one step further
					a[j+1]=temp;
					
					
				}
			}
		}
		System.out.println("After Sorting:"+Arrays.toString(a));
		}
	}


