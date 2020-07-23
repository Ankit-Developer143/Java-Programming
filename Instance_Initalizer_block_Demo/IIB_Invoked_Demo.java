package Instance_Initalizer_block_Demo;
//IIB Invoked when class or Constructed Invoked
class test2{
	test2() {
		System.out.println("Constructor invoked");
	}
	{
		System.out.println("IIB Invoked");
	}
}





public class IIB_Invoked_Demo {
	public static void main(String[] args) {
		test2 t =new test2();
		
	}

}
