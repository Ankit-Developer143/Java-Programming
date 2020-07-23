	package All_Interview_tecnical;

import java.util.Scanner;

public class FindReverseNumberand_Palindrome {
	public static void main(String[] args) {
		
	int rev=0;
	int rem;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number");
	int num=sc.nextInt();
	int original=num;
	while(num>0) {
		rem=num%10;
	    rev=rev*10+rem;
	    num=num/10;
	}
	if(original==rev) {
		System.out.println("This Is palindrome");
	}else {
		System.out.println("This is not Palindrome");
	}
	System.out.println("The Reverse number Is: "+rev);
	
	}

}
