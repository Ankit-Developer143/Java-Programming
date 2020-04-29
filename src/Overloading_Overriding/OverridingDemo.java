package Overloading_Overriding;
//Overriding means having two methods with the same method name and parameters (i.e., method signature)
//One of the methods is in the parent class and the other is in the child class.
//Overriding allows a child class to provide a specific implementation of a method that is already provided its parent class.



class Human{
	protected void Eat() {
		System.out.println("Human eat food");
	}
}
	class Animal extends Human{
		private void Dog() {
			System.out.println("Animal like Dog");
		}
		
		protected void Eat() {
			System.out.println("Human eat m2");
			
		}
		
	}


public class OverridingDemo {
	public static void main(String[] args) {
		Human h=new Human();
		h.Eat();
		
		
		
	}
	
	

}
