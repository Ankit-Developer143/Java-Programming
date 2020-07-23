package OOPs;

interface Rat {
	void Eat();
}

interface Bat {
	void flying();
}

class Mixture implements Rat, Bat {
	public void Eat() {
		System.out.println("Can i Eat");

	}

	public void flying() {
		System.out.println("Can i Sleep");

	}
}

public class Interface_Multiple {
	public static void main(String[] args) {
		Mixture m = new Mixture();
		m.Eat();
		m.flying();

	}
	
}
/*
 * op:-Can i Eat Can i Sleep
 */


