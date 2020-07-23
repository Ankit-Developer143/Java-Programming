package Collection;
//LinkedList implements the Collection interface.
//It uses a doubly linked list internally to store the elements.
//It can store the duplicate elements.
//It maintains the insertion order and is not synchronized. 
//In LinkedList  the manipulation is fast because no shifting is required.
//allow null values;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Demo {
	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<String>();
		l.add("Ankit");
		l.add("Singh");
		l.add("Solanki");
		l.add(null);
		
	
		
		
		
		
		Iterator <String> i=l.iterator(); 
	    while(i.hasNext()) {
	    	System.out.println(i.next());
	    }
	}

}
