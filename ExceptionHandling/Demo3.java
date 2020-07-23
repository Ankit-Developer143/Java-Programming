package ExceptionHandling;


//finally block always Run 	
	class test3{
		int a=10;
		int b=0;
		int c;
		public void Display() {
			try {
				
				c=a/b;
				c=b/a;
				System.out.println(c);
			
		}
		catch(Exception e) {
			System.out.println(e);
			e.getStackTrace();
			
		}
			finally {
				System.out.println("hey dude u r entering final block");
			}
	}
	}
		public class Demo3{
		public static void main(String[] args) {
			test3 t=new test3();
			t.Display();
			}
		}
	



