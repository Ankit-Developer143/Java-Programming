package All_Basic_Operation;
//When we declare the same method in child class which is already present in the parent class 


class Parent{
	
	public void Display() {
		System.out.println("This is Parent Method");
	}
}
class Child extends Parent{
	
	public void Display() {
		System.out.println("This is Child constructor 2");
		
	}
}
public class Overriding_Demo {
	public static void main(String[] args) {
		Child c=new Child();
		c.Display();
		
		Parent p=new Parent();
		p.Display();
		
		
		
	}

}
