package OOPs;

class test4 {
	test4() {
		System.out.println("Super Class");
	}
}

class Test5 extends test4 {
	Test5() {
		super(); // super.test4();
		System.out.println("Sub Class");
	}

}

public class Super_Keyword {
	public static void main(String[] args) {
		Test5 t = new Test5();

	}

}/*
	 * op:-Super Class 
	 * Sub Class
	 */
