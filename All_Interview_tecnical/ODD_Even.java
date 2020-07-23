package All_Interview_tecnical;

import java.util.Scanner;

public class ODD_Even {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The First Number");
		int a=sc.nextInt();
		
		if(a%2==0) {
			System.out.println("This Is even Number");
		}
		else {
			System.out.println("This is odd numbers");
		}
	}

}
