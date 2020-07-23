package Synchronized_Method_Demo;
class Table{
	void show(int a) {
		synchronized(this) {
			for(int i=1;i<=5;i++) {
				
			
			try {
				Thread.sleep(500);
				System.out.println(a*i);
			}
			catch(Exception e) {
				System.out.println(e);
				e.printStackTrace();
			}
			}
		}
	}
	
}


public class Synchronized_block {
	public static void main(String[] args) {
		Table d=new Table();
		
		
		Thread t1=new Thread() {
		 public void run() {
			 d.show(5);
		 }
			
		};
		Thread t2=new Thread () {
			public void run() {
			d.show(10);	
			}
		};
		t2.start();
		t1.start();
		
			
		}
	}


