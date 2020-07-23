package OOPs;

interface Rat1 {
	void Eat();

	default void print() {
		System.out.println("This is the new Introducing Default Method");
	}
}

class Mixture1 implements Rat1 {
	public void Eat() {
		System.out.println("Can i Eat");

	}
}

public class Interface_Default_Method {
	public static void main(String[] args) {
		Mixture1 m = new Mixture1();
		m.Eat();
		m.print();

	}

}
/*
 * op:-Can i Eat 
 * This is the new Introducing Default Method
 */
