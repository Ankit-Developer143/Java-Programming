package Synchronized_Method_Demo;
class Test{
	synchronized void display(int n){
		for(int i=1;i<5;i++) {
			try {
				System.out.println(n*i);
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		
	}
}


public class Using_Anynomous_Demo3 {
	public static void main(String[] args) {
		Test t=new Test();
		
		Thread d1=new Thread() {
		public void run() {
			t.display(5);
		}
		};
		Thread d2=new Thread() {
			public void run() {
				t.display(100);
			}
			
		};
		d1.start();
		d2.start();
		
	}

}
