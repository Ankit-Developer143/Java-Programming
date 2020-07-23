package All_Interview_tecnical;
//find length
//find remainder
//using for Loops (.length) remainder*mul=mul  
public class Palindrome {
	public static void main(String[] args) {
		int temp=151;
		int a=temp;
		int rem;
		int rev = 0;
		while(a!=0) {
		rem=a%10;
	    rev=rev*10+rem;
	    a=a/10;
		
		}
		if(temp==rev) {
			System.out.println("The Number Is palindrome");
		}
		else {
			System.out.println("The Number Is not palindrome");
		}
		
		
	}

}
