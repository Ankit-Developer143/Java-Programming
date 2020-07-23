package Collection;

import java.util.*;

public class Iterator_previous {
	public static void main(String[] args) {
		List c=new ArrayList();
		c.add("Ankit");
		c.add(123456);
		c.add("Rahul");
		c.add(546);
		
		ListIterator l=c.listIterator();
		
		while(l.hasNext()) {
			System.out.println(l.next());
		}
		
		
		System.out.println("**********Previous value checked**********");
		
		
		while(l.hasPrevious()) {
			System.out.println((l.previous()));
		}
		
		System.out.println("**********Remove Method*********");
		c.remove("Ankit");
		System.out.println(c);
		System.out.println("******Remove Index Value*********");
		c.remove(2);
		System.out.println(c);
	}

}
