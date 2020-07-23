package multithreading_Demo;
//its also called runnable interface
class Demo1 implements Runnable{

	@Override
	public void run() {
		System.out.println("Implementation of Runnable");
		
	}
	
}

public class Runnable_implements_Demo {
	public static void main(String[] args) {
		Demo1 d=new Demo1();
		
		Thread t=new Thread(d);
		
		//t.start();
		t.run();
		System.out.println("Hi");
		
	}

}
