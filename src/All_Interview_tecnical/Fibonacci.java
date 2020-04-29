package All_Interview_tecnical;
//previous value Addition like 011235813
public class Fibonacci {
	public static void main(String[] args) {
		
		int a=0,b=1,c;
		
		for(int i=0;i<5;i++) {
			c=a+b;
			System.out.println(c);
			a=b;  //here a value are 1
			b=c;  //1
		}
		
		
	}

}
