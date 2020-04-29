package Overloading_Overriding;
//Same method name in same class
class test5{
	
	public void People() {
		System.out.println("this is the People method");
		
	}
	public void People(int a) {
		System.out.println("This  is method 2");
	}
}

public class overloadingDemo3 {
	public static void main(String[] args) {
		
		test5 t=new test5();
		t.People();
		t.People(10);
	}


}
