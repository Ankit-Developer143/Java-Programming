package edabit;

public class factorial {
public static int factorial(int num) {
	int result = 1;
	for(int i=1;i<=num;i++) {
		result = result*i;
		
	}
	return result;
		
	}
	public static void main(String[] args) {
		factorial f =new factorial();
		System.out.println(f.factorial(5));
		
	}

}
