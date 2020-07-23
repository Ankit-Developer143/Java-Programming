package Overloading_Overriding;


//Overloading occurs when two or more methods in one class have the same method name but different parameters.

class test8{
	public void Show() {
		System.out.println("method 1");
	}
	public void Show(int b,int a) {
	
		int c=a+b;
		
		System.out.println(c);
		
	}

	
	
	public static void main(String[] args) {
		test8 t=new test8();
		t.Show(10, 20);
		t.Show();
	}
	
	


}
