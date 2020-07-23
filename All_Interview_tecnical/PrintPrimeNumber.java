package All_Interview_tecnical;

import java.util.Scanner;

public class PrintPrimeNumber {
	public static void main(String[] args) {
		
		int a;
		int temp=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Value");
		a=sc.nextInt();
		
		for(int i=0;i<=a;i++) {  // Start to end
			for(int j=2;j<=i-1;j++) {
				if(i%j==0) {
					temp=temp+1;
				}
			}
			
			if(temp==0) {
			System.out.println(i);	
			}
			else {
				temp=0;
			}
			
		}
	}

}
