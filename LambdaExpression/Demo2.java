package LambdaExpression;
interface Test1{

void Display();

default void print() {
	System.out.println("Default method");
}
}

public class Demo2 {
	public static void main(String[] args) {
		Test1 t=()->{
			System.out.println("Hello");
			
		};t.Display();
		t.print();
	}

}
