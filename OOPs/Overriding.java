package OOPs;
/*Java Overriding Rules
Both the superclass and the subclass must have the same method name, the same return type and the same parameter list.
We cannot override the method declared as final and static.
We should always override abstract methods of the superclass*/

class human {
	public void display() {
		System.out.println("Parent Class");

	}

}

class people extends human {
	public void display() {
		System.out.println("Child Class");
	}

}

public class Overriding {
	public static void main(String[] args) {
		people p = new people();
		p.display();// OP:-Child Class

		human h = new human();
		h.display();// OP:-Parent Class

	}

}
