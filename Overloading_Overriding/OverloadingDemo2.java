package Overloading_Overriding;

//Method Overloading is a feature that allows a class to have more than one method having the same name
class Test{
	int Addition(int b,int a) {
		
		int c=a+b;
		System.out.println(c);
		return a;
	
	}
	
	int Addition(int a,int b,int c) {
		
		int c1=a+b+c;
		
		System.out.println(c1);
		return c1;
	}
}

public class OverloadingDemo2 {
public static void main(String[] args) {
	Test t=new Test();
	t.Addition(10, 20);
	t.Addition(10, 20, 30);
}
}
