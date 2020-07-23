package All_Interview_tecnical;

public class FindNumbersOfDigit {
	public static void main(String[] args) {
		int n=1534569874;
		int t=n;  //thats not change Actual Values
		int length=0;
		
		while(t!=0) {
			t=t/10;
			length=length+1;
			
		}
		System.out.println(length);
	}

}
