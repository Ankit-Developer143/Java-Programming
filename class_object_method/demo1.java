package class_object_method;

//this is class
public class demo1 { 
	
	//this is instance variable
	String name="Ankit";
	String class1="fycs";
	
	//This is method
	public void Method() {
		System.out.println("Hello This Is method ");
	}
	
	//This is main Method its compulsory in java 
	public static void main(String[] args) {
		
		//This Is the object 
		//here d is the class reference
		demo1 d=new demo1(); 
		
		
		System.out.println(d.name);
		System.out.println(d.class1);
		
		d.Method();
		//class reference.Method name 
		
		
	}

}
