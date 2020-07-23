package Wrapper_Class;

public class Boxing_UnBoxingDemo1 {
	public static void main(String[] args) {
		int a=10;
		
		
		Integer i=Integer.valueOf(a);
		System.out.println("a:"+a);
		
		int j=i;
		System.out.println("j:"+j);
		
		
		
		//unboxing
		//converting wrapper class object to primitive
		Integer obj=new Integer(30);
		
		int num= obj.intValue();  //creating int Value
		System.out.println(num+""+obj);
		
		
		
	}

}
