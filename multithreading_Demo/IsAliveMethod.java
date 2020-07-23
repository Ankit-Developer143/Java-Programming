package multithreading_Demo;

public class IsAliveMethod extends Thread {
	public void run() {
		System.out.println("This is Run method");
		try {
			sleep(1000);
			System.out.println(" ");
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("hello");
	}
	public static void main(String[] args) {
		Thread t=new Thread();
		t.isAlive();
		t.start();
		t.run();
	
		IsAliveMethod ia=new IsAliveMethod();
		
		ia.start();
	}
	
	

}
