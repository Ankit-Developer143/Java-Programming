package edabit;

public class Free_Coffee_Cups {
	public static int totalCups(int n) {
		int normal_cups = 0;
		int extra = 0;
		for(int i = 1;i<=n;i++) {
		  normal_cups++;
		
			if(i%6 == 0) {
			 extra++;
				
			}
			
		}
		return (extra + normal_cups);
	}
	public static void main(String[] args) {
		Free_Coffee_Cups f =new Free_Coffee_Cups();
		System.out.println(f.totalCups(5));
		
	}
	
}
		
		
	  
