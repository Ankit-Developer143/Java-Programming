package Collection;

import java.util.Iterator;
import java.util.Vector;

//Follow synchronised way
//Vector uses a dynamic array to store the data elements. It is similar to ArrayList. However
//It is synchronized and contains many methods that are not the part of Collection framework.
//Accept Null values.
public class Vector_Demo {
	public static void main(String[] args) {
		
		Vector<String> v=new Vector<String>();
		v.add("Ankit");
		v.add("Ram");
		v.add("Pyan");
		v.add(null);
		
		Iterator<String> it=v.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
	}
	}

}
