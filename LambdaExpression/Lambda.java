package LambdaExpression;
interface Demo{
	void Display();
}




public class Lambda {
	public static void main(String[] args) {
		Demo d=()->{
			
	
			
		System.out.println("Hello");
		};
		d.Display();
		Demo d1=new Demo() {

			@Override
			public void Display() {
				System.out.println("Method 2");
				
			}
			
		};d1.Display();
	}

}
