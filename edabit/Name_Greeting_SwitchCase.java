package edabit;

import java.util.Scanner;

class test{
	String name;
	test(String name) {
		this.name = name;
		
	}
	public void M1() {
		switch(name) {
		case "Gerald":
			System.out.println("Hello Gerald!");
			break;
		case "Tiffany":
			System.out.println("Hello Tiffany!");
			break;
		case "Ed":
			System.out.println("Hello Ed!");
			
		}
	}
}

public class Name_Greeting_SwitchCase {
	public static void main(String[] args) {

		test t =new test("Tiffany");
		t.M1();
		
	}

}
