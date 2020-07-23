package OOP_Nested_Class;
class MBoard{
	String Name;
	MBoard(String Name){
		this.Name = Name;
	}
	
	 class USB1{
		int usb3 = 1;
		int usb4 = 2;
		int totalPort() {
			if(MBoard.this.Name.equals("MSI")) {
				return 4;
			}else {
				return usb3+usb4;
			}
		}
	}
}


public class Accessing_members_of_Outer_class_inside_Inner_ClassDemo2 {
	public static void main(String[] args) {
		MBoard m = new MBoard("usb");
		
		MBoard.USB1 u = m.new USB1();
		System.out.println(u.totalPort());
		
		
	}//op:-3

}
