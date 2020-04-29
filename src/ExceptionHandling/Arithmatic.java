package ExceptionHandling;
//Index Out of Bond Show
public class Arithmatic {
int a[]=new int[5];
	
	void Show() {
	try {
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;
	a[5]=a[0]/a[1];
	for(int element: a) {
		System.out.println(element);
	}

	}
	catch(ArithmeticException e) {
		System.out.println(e);
		e.printStackTrace();
		
	}


}
	public static void main(String[] args) {
		Arithmatic e=new Arithmatic();
		e.Show();
	}


}
