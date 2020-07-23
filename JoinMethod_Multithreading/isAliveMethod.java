package JoinMethod_Multithreading;

public class isAliveMethod extends Thread {
	public void run() {
		
		
		System.out.println("Method 1");
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
		
		
	public static void main(String[] args) {
		isAliveMethod ia=new isAliveMethod();
		ia.start();
		
		System.out.println("isAlive Method"+ia.isAlive());
		
	}

}
