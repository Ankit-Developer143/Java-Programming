package All_Interview_tecnical;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number Which You Want To Table");
		int t=sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			int a=t*i;
			System.out.println("The Table of " +t+ "*" +i+"="+a);
			
		}
		
	}

}
