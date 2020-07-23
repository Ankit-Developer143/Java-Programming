//method are abstract then class also declare abstract
//vice versa not possible
//if abstract keyword are use in method then no body envolve
//Abstract class can extend only one class or one abstract class at a time
package Abstract_And_Interface;
 class example{
	 void display1() {
		 System.out.println("This is method1");
	 }
 }
 
 abstract class example2{
	 void display2() {
		 System.out.println("this is method 2");
	 }
 }


 abstract class example3 extends example{
	 abstract void display3() ;
		 
 }
 class example4 extends example3{     //class extends class unimplemented method need

	@Override
	void display3() {
		System.out.println("This is method 3");
		
	}
	 
 }
public class AbstractDemo2 {
	public static void main(String[] args) {
		example4 e=new example4();
		e.display1();
		e.display3();
	
	
			
		}
	
	}


 