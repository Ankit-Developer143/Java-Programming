package NestedClass_Demo;
//A class is created for implementing interface or abstract or extending class
//if class is abstract then method body required
abstract class test{
	abstract void display() ;

}
public class Anynomus_Abstract_Demo2 {
public static void main(String[] args) {
	test t=new test() {

		@Override
		void display() {
			System.out.println("Anynomous class");
			
		}
		
	};
	t.display();
}	

}
