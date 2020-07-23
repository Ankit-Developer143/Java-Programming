package OOPs;

//Inheritance is an is-a relationship. 
//We use inheritance only if an is-a relationship is present between the two classes.
class Animal {
	public void Eat() {
		System.out.println("can i eat");
	}

	public void Sleep() {
		System.out.println("can i sleep");

	}

}

class Dog extends Animal {
	public void bark() {
		System.out.println("dog barking");
	}
}

public class Inheritance_Demo1 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.Eat();
		d.Sleep();
		d.bark();

	}

}/*
	 * op :- can i eat can i sleep dog barking
	 */
