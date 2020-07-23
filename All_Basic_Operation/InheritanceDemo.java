package All_Basic_Operation;
// A class acquire the properties of another class
//is-a relationship

class Test{
	int a=10, b=10;
	void Display() {
		System.out.println("The Addition of Two number is:"+(a+b));
	}
}
	class Test1 extends Test{
		void Print() {
			System.out.println("this is method :"+(a+b));
		}
	}
		public class InheritanceDemo{
		public static void main(String[] args) {
			Test1 t=new Test1();
			t.Display();
			t.Print();
		}
	}
	


