package NestedClass_Demo;
//a class which is declared inside the class 
//represent a special type of relationship that it can access all member(method)of outer class including private


//declared inside the class outside the method

class outer5{
	{
		System.out.println("Hello");
	}
	class inner{
		void msg() {
			System.out.println("Inner Class");
		}
		
	}
}
public class Nestedclass_MemberInner_Demo {
public static void main(String[] args) {
	outer5 o=new outer5();
	
	outer5.inner i=o.new inner();
	i.msg();
	
	
	
	
	
}
}
