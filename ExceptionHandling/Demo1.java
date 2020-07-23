package ExceptionHandling;

;

class Demo1 {
	public void test() {
	int a[]=new int[5];
		try {
		     a[0]=10;
			 a[1]=20;
			 a[2]=30;
			 a[3]=40;
			 a[4]=50;
		
			 
			
			 for(int i=0;i<5;i++) {       //if we use this for(int i=0;i<=5;i++) show error oob
				 System.out.println(a[i]);
			 }

}
	

		catch(Exception e) {
			System.out.println(e);
		}
		
		
	

	}
	
	public static void main(String[] args) {
		Demo1 d=new Demo1();
		d.test();
	}
}




