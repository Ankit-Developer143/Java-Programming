package OOP_Nested_Class;

/*Static Nested Class
In Java, we can also define a static class inside another class. Such class is known as static nested class. Static nested classes are not called static inner classes.

Unlike inner class, a static nested class cannot access the member variables of the outer class. It is because the static nested class doesn't require you to create an instance of the outer class.

Syntax:-
OuterClass.NestedClass obj = new OuterClass.NestedClass();*/

class MotherBoard {
	static class USB {
		int usb2 = 1;
		int usb3 = 2;

		int getUsb() {
			return usb2 + usb3;

		}
	}

}

public class Static_inner_class {
	public static void main(String[] args) {
		MotherBoard.USB u = new MotherBoard.USB();
		System.out.println(u.getUsb());

	}

}//op:-3
