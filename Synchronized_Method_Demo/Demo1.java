package Synchronized_Method_Demo;
//Synchronization in java is the capability to control the access of multiple threads to any shared resource.
//Java Synchronization is better option where we want to allow only one thread to access the shared resource
public class Demo1 {
	public synchronized void Send(String msg) {
		System.out.println("Sending.."+msg);
	
	 try 
     { 
         Thread.sleep(1000); 
     }  
     catch (Exception e)  
     { 
         System.out.println("Thread interrupted."); 
     } 
     System.out.println("\n" + msg + "Sent"); 
 
 } 


	public static void main(String[] args) {
		Demo1 d=new Demo1();
		d.Send("Hello");
	}
}
