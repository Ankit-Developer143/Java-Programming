package edabit;

public class Simple_OOP_Calculator {
	int result;
	
	public int add(int a,int b) {
		 return result = a+b;
		
		
	}
	public int subtract(int a,int b) {
		return result = a-b;
		
		
	}
	public int multiply(int a,int b) {
		return result = a*b;
		
		
	}
	public int divide(int a,int b) {
		return result = a/b;
		
		
	}
	
	
	public static void main(String[] args) {
		Simple_OOP_Calculator c = new Simple_OOP_Calculator();
		System.out.println(c.divide(10, 5));
	}

}
