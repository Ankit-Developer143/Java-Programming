package Synchronized_Method_Demo;



public class DeadLock_Demo {
	public static void main(String[] args) {
		String s1="Ankit Singh";
		String s2="Aditya Singh";
		
		
		
		
		Thread t1=new Thread() {
			public void run() {
					synchronized(s1) {
						System.out.println("Thread 1:DeadLock 1");
					
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (s2) {
						System.out.println("Thread 2:Dead Lock 2");
						
					}
			}
			}
		};
		Thread t2=new Thread() {
		public void run() {
			synchronized(s2) {
					System.out.println("Thread 2:Dead Lock 2");
				
		
			try {
				Thread.sleep(500);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (s1) {
				System.out.println("Thread 1:Dead lock 1");
				
			}
			
		}
		}
		
		
		};
		t1.start();
		t2.start();
		
	}

}
