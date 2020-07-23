package OOPs;

abstract class Demo {
	void display() {
		System.out.println("This is the Abstract class");
	}

}

class Demo1 extends Demo {

}

public class Inheritance_of_Abstract_Class {
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.display();
	}

}// op:-This is the Abstract class
