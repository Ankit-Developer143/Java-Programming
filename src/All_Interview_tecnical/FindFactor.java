package All_Interview_tecnical;
//Example whose number divide by  10:-1,2,5,10
import java.util.Scanner;

public class FindFactor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Value");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				System.out.println(i);
			}
		}
		
	}

}
