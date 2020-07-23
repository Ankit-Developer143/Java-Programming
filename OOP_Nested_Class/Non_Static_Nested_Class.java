package OOP_Nested_Class;

/*A non-static nested
class is a class within another class. 
It has access to members of the enclosing class (outer class).
It is commonly known as inner class
*/
class Animal {
	// Nested Class
	class Dog {
		// Nested Class Method
		void Eat() {
			System.out.println("The Dog Eating Food");
		}

	}

	protected class Human {
		void Eat() {
			System.out.println("Human Also Eat Food");
		}
	}
}

public class Non_Static_Nested_Class {
	public static void main(String[] args) {

		// First Create Class Reference Objects
		Animal a = new Animal();

		// create an object of inner class Processor using outer class
		Animal.Dog d = a.new Dog();

		// create an object of inner class Human using outer class Animal
		Animal.Human h = a.new Human();

		d.Eat();
		h.Eat();

	}

}/* op:-The Dog Eating Food 
Human Also Eat Food
	 */
