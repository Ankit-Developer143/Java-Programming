package JoinMethod_Multithreading;

public class joinMethod_Demo extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
				
			}
			catch(Exception e) {
				
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		joinMethod_Demo jm=new joinMethod_Demo();
		
		joinMethod_Demo jm1=new joinMethod_Demo();
		
		jm.start();
		
		jm1.start();
	}
	

}
