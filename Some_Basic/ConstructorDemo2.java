package Some_Basic;

class Test {
	int identity;
	String Name;

	Test(int identity, String name) {
		this.identity = identity;
		this.Name = name; // its also work
	}

	void Print() {
		System.out.println(" " + Name + " " + identity);
	}
}

public class ConstructorDemo2 {
	public static void main(String[] args) {

		Test obj = new Test(1, "ramesh");
		obj.Print();

	}

}//op:-ramesh 1
