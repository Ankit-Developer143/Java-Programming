package multithreading_Demo;

public class RunnableDemo {
	public static void main(String[] args) {
		Runnable r=()->{
			
				System.out.println("This is the functional method");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException i) {
				System.out.println(i.getStackTrace());
			}
			
			
		};
		System.out.println("hello");
		Thread t=new Thread(r);
		t.start();
		
		
		
	
	}

}
