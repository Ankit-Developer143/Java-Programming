package NestedClass_Demo;
interface I{
	void eat();
}

public class Anynomous_interface_Demo {
	public static void main(String[] args) {
I i=new I() {

	@Override
	public void eat() {
		System.out.println("Eat mango");
		
	}
	
};
i.eat();


}
}
