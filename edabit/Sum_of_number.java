package edabit;

public class Sum_of_number {
public static int sum(int n) {
	int result= 0;
	for(int i = 1;i<=n;i++) {
		result = result+i;
		
	}
	return result;
		
	}
	public static void main(String[] args) {
		Sum_of_number s = new Sum_of_number();
		
		System.out.println(s.sum(5));
		
		
	}

}
