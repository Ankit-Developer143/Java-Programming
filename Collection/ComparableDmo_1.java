package Collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//Tree Set info
//retrival time queit Fast
//Does not Allow Null Elements
//non synchronised
//maintain Ascending Order	

class books implements Comparable<books>{
	int id;
	String Name;
	String Author;
	String Publisher;
	int Quantity;
	

	public books(int id, String name, String author, String publisher, int quantity) {
		super();
		this.id = id;
		Name = name;
		Author = author;
		Publisher = publisher;
		Quantity = quantity;
	}
	@Override
	public int compareTo(books o) {
		if(id>o.id) {
		return 1;
		
	}
	else if(id<o.id) {
		return -1;
	}else {
		return 0;
		
	}
	
}

}
public class ComparableDmo_1 {
	public static void main(String[] args) {
	Set<books> s=new TreeSet<books>();
books b1=new books(1,"Ankit","Ram","DinDyal",5);
books b2=new books(1,null,"Mahesh","ni",6);

s.add(b1);
s.add(b2);
for(books s1:s) {
	System.out.println(s1.id+" "+s1.Name+" "+s1.Author+" "+s1.Publisher+" "+s1.Quantity);
	

}

}
}

