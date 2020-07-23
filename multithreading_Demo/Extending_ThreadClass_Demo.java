package multithreading_Demo;

class test extends Thread{
	public void run() {
		System.out.println("This is thread");
	}
	
}

public class Extending_ThreadClass_Demo {
	public static void main(String[] args) {
		test t =new test();
		
		t.run();
		//or t.start();
	}

}
