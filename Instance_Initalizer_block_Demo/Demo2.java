package Instance_Initalizer_block_Demo;
// is used to initialize the instance data member.
//It run each time when object of the class is created.
class Test{
	{
		System.out.println("Initiliser block invokd before the constructor");
	}
	{
		System.out.println("Initilizer block 2");
	}
	Test(){
		System.out.println("Constructor");
	}
	
}

public class Demo2 {
	public static void main(String[] args) {
		
	
	Test t=new Test() ;
		
	}

}
