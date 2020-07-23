package OOPs;

/*Can we access the method of the superclass after overriding?

Well, the answer is Yes.
To access the method of the superclass from the subclass, we use the super keyword.
*/

class test2 {
	public void displayinfo() {
		System.out.println("Super Class");
	}
}

class Test3 extends test2 {
	public void displayinfo() {
		super.displayinfo();
		System.out.println("Sub Class");
	}

}

public class Super_Keyword_Used_in_Overriding {
	public static void main(String[] args) {
		Test3 t = new Test3();
		t.displayinfo();

	}

}/* op 
Super Class
Sub Class*/
