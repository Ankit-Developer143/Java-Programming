package Collection;

import java.util.Iterator;
import java.util.TreeSet;

//Not Allow Null values
//Non Synchronized
//
public class TreeSetDemo1 {
	public static void main(String[] args) {
		
	
	TreeSet<String> t=new TreeSet<String>();
t.add("Ankit");
t.add("Singh");
t.add("Shivanand");

//System.out.println(t.pollFirst());//Ankit Singh Shivanand
System.out.println(t.pollLast());//singh Shivanand Ankit

/*Iterator<String> i=t.iterator();*/
Iterator i=t.descendingIterator();

while(i.hasNext()) {
	System.out.println(i.next());
	
	

}
	}

}
