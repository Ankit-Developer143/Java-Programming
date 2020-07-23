package OOP_Nested_Class;

class Polygon{
	int a = 10;
	int b = 20;
	void getResult() {
		int result = a+b;
		System.out.println(result);
	}
}
	class Anonymous {
		public void CreateobjReference() {
			
			Polygon p = new Polygon() {
				public void getResult() {
					//super.getResult();
					System.out.println("Inside Anonymous Class");
				}
				
			};
			p.getResult();
		}
	}


public class Anonymous_Class_Extending_a_Class {
	public static void main(String[] args) {
		Anonymous a =new Anonymous();
		a.CreateobjReference();
	}
	
}//op:-Inside Anonymous Class
		
		
		