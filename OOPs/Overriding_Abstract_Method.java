package OOPs;

abstract class Cat {
	abstract void print();

}

class Dog1 extends Cat {

	@Override
	public void print() {
		System.out.println("Bark");

	}

}

class donkey extends Cat {
	public void print() {
		System.out.println("Dehu Dehu");
	}
}

public class Overriding_Abstract_Method {
	public static void main(String[] args) {
		Dog1 d1 = new Dog1();
		d1.print();
		donkey d2 = new donkey();
		d2.print();

	}

}
