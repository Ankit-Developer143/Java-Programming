package OOPs;

/*Here, Polygon is an interface. We have used the interface keyword to declare an interface.

The getArea() method is a specification defined in the Polygon interface.
All classes that use this interface must implement the getArea() method.

An interface can include abstract methods and constants.for Example:-

interface Polygon {
	   public void getArea();
	}*/


interface Polygon {
	void getArea(int l, int b);
}

class rectangle implements Polygon {
	public void getArea(int l, int b) {
		int result = l * b;
		System.out.println(result);
	}
}

public class Interface_Demo {
	public static void main(String[] args) {
		rectangle r = new rectangle();
		r.getArea(5, 5);

	}

}
