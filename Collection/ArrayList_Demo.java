package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Demo {
	public static void main(String[] args) {
		ArrayList<String> i=new ArrayList<String>(); 
		i.add("Ankit");
		i.add("Ram");
		i.add("Ramesh");
		
		Iterator it=i.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
