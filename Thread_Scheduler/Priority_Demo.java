package Thread_Scheduler;

class Priority extends Thread{
	public void run() {
		System.out.println("The Thread Name:"+Thread.currentThread().getName());
		System.out.println("The Thread priority :"+Thread.currentThread().getPriority());
	}
}

public class Priority_Demo {
	public static void main(String[] args) {
		Priority p=new Priority();
		Priority p1=new Priority();
		p.setPriority(Thread.MAX_PRIORITY);
		p1.setPriority(Thread.MIN_PRIORITY);
		p.start();
		p1.start();
	}

}
