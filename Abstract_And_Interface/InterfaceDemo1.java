package Abstract_And_Interface;

interface People{
	void eat();

	
}
		class Dog implements People{
			public void eat() {
				System.out.println("This is the Interface Method");
				
			}
			
		
	
}

public class InterfaceDemo1 {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();
	}

}
