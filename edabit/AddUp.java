package edabit;

public class AddUp {
	 public static int addUp(int num) {
		 int result = 0;
		 for(int i =0;i<=num;i++) {
			 result +=i;
			 
		 }
		 return result;
	      
	    }
	public static void main(String[] args) {
		AddUp a = new AddUp();
		System.out.println(a.addUp(13));
	}

}
