package All_Interview_tecnical;
//4 factorial is 4! = 4 x 3 x 2 x 1 = 24.

import java.util.Scanner;

public class FindFactorial {
	public static void main(String[] args) {
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The number");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			fact=fact*i;
		}
		System.out.println("The factorial of  " + a +  "  is: "+fact);
	}

}
