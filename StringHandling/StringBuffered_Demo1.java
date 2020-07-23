package StringHandling;
//both are mutable
//buffered are synchronized and builder are a shrynconrized
//builder is not thread safe
//buffer are thread safe
//multi operation perform in buffer
//buffer at a time one

public class StringBuffered_Demo1 {
	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Hello");
		
		StringBuffer s1=new StringBuffer("hi");
		
	//append	
	System.out.println(s.append(s1));//Hello hi
	
	
	//capacity
	System.out.println(s.capacity());//21
	
	//charrAt
	System.out.println(s.charAt(1));//e
	
	
	//length
	System.out.println(s1.length());//2
	
	//insert
	System.out.println(s1.insert(0, 'b'));//bhi
	
	//delete
	System.out.println(s1.deleteCharAt(1));//bi
	
	//replace
	
	System.out.println(s1.replace(0, 2, "Coder infotech"));//Coder infotech
	
	
	
	}

}
