package Synchronized_Method_Demo;

//excute one after other
//Randomly possible

class StaticDemo{
	synchronized static void print(int n) {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println(n*i);
				
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
class Test1 extends Thread{
	
	public void run() {
		StaticDemo.print(5); //className.MethodName()
	}
}
class Test2 extends Thread{
	
	public void run() {
		StaticDemo.print(10); //className.MethodName()
	}
}
class Test3 extends Thread{
	
	public void run() {
		StaticDemo.print(15); //className.MethodName()
	}
}
class Test4 extends Thread{
	
	public void run() {
		StaticDemo.print(20); //className.MethodName()
	}
}


public class Demo5{
	public static void main(String[] args) {
		//StaticDemo d=new StaticDemo();
		Test1 t1=new Test1();
		Test2 t2=new Test2();
		Test3 t3=new Test3();
		Test4 t4=new Test4();
		
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
			
	}
	
}