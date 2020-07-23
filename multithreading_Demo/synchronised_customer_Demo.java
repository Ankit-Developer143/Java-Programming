package multithreading_Demo;

	 class synchronised_customer_Demo{
		int amt=1000;
	
	public synchronized void withdraw(int amt) {
		
		if(this.amt>amt) {
			System.out.println("Less amount");
			
			try {
				wait();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		this.amt=amt;
		System.out.println("Withdraw succefully");
	
	
	
	}
	public synchronized void Deposite(int amt) {
		
	
		System.out.println("Going to Deposite....");
		this.amt=amt;
		System.out.println("Succefully deposite");
	}
		
	

		
	
public static void main(String[] args) {
	synchronised_customer_Demo c=new synchronised_customer_Demo();
	
	Thread t=new Thread() {
		public void run() {
		c.withdraw(1000);	
		}
	};
	t.start();
	Thread t2=new Thread() {
		public void run() {
			c.Deposite(100);
		}
	};
	t2.start();

}	
	
}	
	
	
	
	
	
	
		
	



