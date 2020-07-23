package Access_Modifier;
//If we do not explicitly specify any access modifier for classes, methods, variables, etc, 

//then by default the default access modifier is considered;

public class Default_Demo {
	void print() {
		System.out.println("This is the Default Access Modifier");
	}

	public static void main(String[] args) {
		Default_Demo obj = new Default_Demo();
		obj.print();

	}

}
