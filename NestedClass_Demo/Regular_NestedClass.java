package NestedClass_Demo;

class outer1{
	int a=10;
	int b=20;
	void show() {
		System.out.println("a:"+a);
	}
	class inner1{
		int c=30;
		int d=40;
		
		void Diaplay() {
			System.out.println("c:"+c);
		}
		
	}
	
	
}

public class Regular_NestedClass {
	public static void main(String[] args) {
		outer1 o=new outer1();
		o.show();
		
		//way1
		
		outer1.inner1 o1=o.new inner1();
		o1.Diaplay();
		
		
		//way2
		outer1.inner1 o2=new outer1().new inner1();
		o2.Diaplay();
		
	}

}
