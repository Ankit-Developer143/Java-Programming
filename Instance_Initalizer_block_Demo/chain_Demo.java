package Instance_Initalizer_block_Demo;
// It is invoked before the constructor is invoked
// It is invoked every time an object is created
class A{
	{
		System.out.println("Hello This is initalizer block");
	}
	A(){
		System.out.println("Parent class is invoked");
	}
}
class B extends A{
	B(){
		super();
		System.out.println("Child Constructor invoked");
	}
	B(int a){
		super();
		System.out.println("Child class constructed invoked"+a);
	}
	{
		System.out.println("Initaliser Block is invoked");
	}
}

public class chain_Demo {
	public static void main(String[] args) {
		B b=new B();
		B b1=new B(10);
	
	}

}
