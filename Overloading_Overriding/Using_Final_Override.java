package Overloading_Overriding;



class Final{
	//can't be overridden
	//final void show() {
	
	void show() {
		System.out.println(" method 1");
	}
}
class childs extends Final{
	void show() {
		System.out.println("Child class");
	}
}

public class Using_Final_Override {
public static void main(String[] args) {
	childs c=new childs();
	c.show();
	
	
}
}
