package Thread_Scheduler;
//Thread scheduler decide which scheduler run first
//we can not use start thread  twice show error
class test extends Thread{
	public void run(){
		for(int i=0;i<10;i++) {
			
		
		try {
			Thread.sleep(500);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		System.out.println(i);
		
	}
		
		
}
}


public class Sleep_Demo {
	public static void main(String[] args) {
		test t=new test();
		test t1=new test();
		t.start();
		t1.start();
		
	}

}
