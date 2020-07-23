package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue_Demo {
public static void main(String[] args) {
	
	Deque<String> d = new ArrayDeque<>();
	d.add("Ankit");
	d.add("Ram");
	d.add("Shyam");
	d.add("Ramesh");
	
	System.out.println(d);
	
	
	//Add First
	d.addFirst("Dinesh");
	System.out.println(d);
	
	//Add Last
	d.addLast("Mahesh");
	System.out.println(d);
	
	
	
//Deque interface extends the Queue interface.
//In Deque, we can remove and add the elements from both the side. 
//Deque stands for a double-ended queue which enables us to perform the operations at both the ends.
}
}
