package Overloading_Overriding;
class ford1{
	void Display() {
		System.out.println("This Is Best");
	}
}	
class nano extends ford1{
   void Display() {
	   System.out.println("this is nano car");
   }
   public void newMethod(){
		System.out.println("new method of child class");
	   }
}

public class OverridingDemo2 {
	public static void main(String[] args) {
		
		nano n= new nano();
		n.Display();
		
		
		
		ford1 f=new nano();
		f.Display();
			
	
	}
	
			

}
