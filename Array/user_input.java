package Array;

import java.util.Arrays;
import java.util.Scanner;

public class user_input {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int sum=0;
	
	System.out.println("Enter The Array length");
	int n=sc.nextInt();
	
	int []a= new int[n];
	
	System.out.println("Enter the number");
	
	for(int i=0;i<n;i++) {
		
		a[i]=sc.nextInt();
		//sum =sum + a[i];
		
	}
	//System.out.println(sum);
	//for(int i:a) {
		//System.out.print(i);
	//}
	System.out.println(Arrays.toString(a));
	
}
}
