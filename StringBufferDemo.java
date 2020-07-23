
public class StringBufferDemo {
	
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Old Object");
		
		//capacity
		System.out.println(sb.capacity());
		
		//length
		System.out.println(sb.length());
		
		StringBuffer sb1=new StringBuffer("NewObject");
		
		//length
		System.out.println(sb1.length());
		
		
		//Add Something (Append)
		System.out.println(sb1.append("Hello"));
		
		//insert
		System.out.println(sb1.insert(1, "Bye"));//op NByeewObjectHello
		
		
		//
		
	}

}
