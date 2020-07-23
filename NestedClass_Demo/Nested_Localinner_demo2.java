package NestedClass_Demo;
//local inner class declared inside the method

class A{
	int data=10;
public void show() {
	//System.out.println("hello");
	class local{
		void display() {
			System.out.println("local inner class:"+data);
			
		}
		
	}
	local l=new local();
	l.display();
}
}
public class Nested_Localinner_demo2 {
	public static void main(String[] args) {
		
		A a=new A();
		a.show();
	}

}
