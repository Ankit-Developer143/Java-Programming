package Thread_Scheduler;
class Naming extends Thread{
	public void run() {
		System.out.println("Running............");
	}
	
}

public class Naming_Thread {
	public static void main(String[] args) {
	
	Naming n1=new Naming();
	Naming n2=new Naming();
	
	
	System.out.println("The Name of N1:"+n1.getName());
	n2.start();
	System.out.println("The name of N2:"+n2.getName());
	
	n1.start();
	
	//Set The Name
	n1.setName("Soni Jaishwaal");
	System.out.println("After Set the Name of N1:"+n1.getName());
	
	//Get The IdName and Current thread
	System.out.println("The Id of N1is:"+n1.getId());
	System.out.println("The Current Thread is:"+n1.currentThread());
	
	
	
	
	
	
	
	}

}
