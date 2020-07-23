package NestedClass_Demo;

class outer3{
	int a=10;
	static int b=20;
	public void Display() {
		System.out.println("a:"+a);
	
	

class inner3{
	int c=30;
	
	void Show() {
		System.out.println("b:"+b);//only static value allow 
		System.out.println("c:"+c);//take all value own class
	}
	
	
}
inner3 i3=new inner3();
i3.Show();


}
}
public class Local_NestedClass {
	public static void main(String[] args) {
		
		outer3 o3=new outer3();
		o3.Display();
				
	}

}




