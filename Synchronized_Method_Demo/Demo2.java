package Synchronized_Method_Demo;

public class Demo2 {
	public void display(String Processing) {
		synchronized (this) {
			try {
				System.out.println("Sending..."+Processing);
				Thread.sleep(5000);
			}
			catch(Exception e ) {
				System.out.println("Interrupted Method");
			}
			System.out.println("Msg Recieve.."+Processing);
		}
	}
	public static void main(String[] args) {
		Demo2 d=new Demo2();
		d.display("Hello");
	}
}
