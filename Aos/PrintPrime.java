package Aos;

public class PrintPrime extends Prime {
	public static void main(String[] args) {
		Prime p=new Prime(Integer.parseInt(args [0]));
		p.start();
	}

	PrintPrime(int n) {
		super(n);
		
	}

}
