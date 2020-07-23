package Aos;

public class Prime extends Thread
{
	int upper;
	Prime(int n){
		upper=n;
		
		System.out.println(n);
	}
	public void run() {
	if(upper<0) {
		System.out.println("Greater than 0!");
		
	}
	else if(upper==0||upper==1) {
		System.out.println("Not Prime Number");
	}
	for(int i=1;i<=upper;i++) {
		int count=0;
		for(int num = i;num>=1;num--) {
			
			if(i%num==0) {
				count=count+1;
			}
			if(count==2) {
				System.out.println(i);
			}
		}
	}
}
}
