//class can be Abstract no need to make method abstract 
//but if method can abstract then class must be declared as abstract


package Abstract_And_Interface;


	abstract class Human{
		abstract void eat(); 
	}
	class Animal extends Human{
		void eat() {
			System.out.println("Human eat");
		}
		
	}
	public class AbstractDemo1 {
	public static void main(String[] args) {
		Animal a=new Animal();
		a.eat();
	}

}
