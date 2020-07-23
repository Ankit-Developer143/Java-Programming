package All_Interview_tecnical;
//The first few values of such that is prime are 1, 2, 4, 6, 12, 14,
public class PrimeNumber {
	public static void main(String[] args) {
		int no=7;
		int temp=0;
		for(int i=2;i<=no-1;i++) {
			if(no%i==0) {
				temp=temp+1;
			}
		}
			if(temp>0) {
				System.out.println("This is not prime number");
			}
			
			else {
				System.out.println("This is Prime Number");
			}
		}
	}

	


