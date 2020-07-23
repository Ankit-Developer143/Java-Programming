package Synchronized_Method_Demo;

public class Demo4 {
	String Name;
	String Class;
	int id;
	
	synchronized void print(String Name,String Class,int id) {
		this.Name=Name;
		this.Class=Class;
		this.id=id;
		try {
			Thread.sleep(5000);
			System.out.println(" Name:"+Name+"\n class:"+Class+"\n ID:"+id);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Demo4 d=new Demo4();
	     d.print("Ankit", "Msc", 10);
		
		Thread t1=new Thread() {
			public void run() {
				d.print("Ram", "Bsc", 10);
			}
			
		};
		Thread t2=new Thread() {
			public void run() {
				d.print("Shyam", "Tycs", 20);
			}
			
		};
		//d.print("Ankit", "Graduate", 3);
		t1.start();
		t2.start();
		
		
		
	}
}
