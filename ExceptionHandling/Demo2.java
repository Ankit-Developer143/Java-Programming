package ExceptionHandling;
class test2{
	int a=10;
	int b=0;
	int c;
	public void Display() {
		try {
			
			c=a/b;
			System.out.println(c);
		
	}
	catch(Exception e) {
		System.out.println(e);
		e.getStackTrace();
		
	}
}
	public static void main(String[] args) {
		test2 t=new test2();
		t.Display();
	}
}

//java.lang.ArithmeticException: / by zero
	

	

