package Thread_Scheduler;
class join extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			//System.out.println(Thread.currentThread());
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
	}
}






public class Join_method_Demo {
	public static void main(String[] args) throws InterruptedException {
		join j=new join();
		join  j1=new join ();
		join j2=new join ();
		j1.start();
		try {
			j1.join();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		j.start();
		j2.start();
	}
	

}
