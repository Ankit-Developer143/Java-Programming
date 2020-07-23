//automatic generate class using $1 sign
//to reduce the code
//mostly used in abstract class
//no class name declared

package NestedClass_Demo;
class outer4{
	int a=10;
	int b=20;
	
	void Show() {
		System.out.println("a:"+a);
	}
}

public class AnynomousClass {
	public static void main(String[] args) {
		outer4 o4=new outer4() {
			void Show() {
				System.out.println("b:"+b);
			}
		};
		o4.Show();
		outer4 o5=new outer4();
		o5.Show();
		
		
		
	}

}

