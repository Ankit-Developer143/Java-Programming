package NestedClass_Demo;
//created within class
//static class allow only static variable
class outer{
	int a=10;
	static int b=20;
	public void Display() {
		System.out.println("a:"+a);
	}
	

static class inner{
	int c=30;
	int d=40;
	
	void Show() {
		System.out.println("b:"+b);//only static value allow 
		System.out.println("c:"+c);//take all value own class
	}
}
}
public class Static_NestedClass {
	public static void main(String[] args) {
		
		
		outer.inner oi=new outer.inner();
		oi.Show();
		
	}
	
}
	
	




