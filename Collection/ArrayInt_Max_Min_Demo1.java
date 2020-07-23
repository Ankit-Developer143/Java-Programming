package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayInt_Max_Min_Demo1 {
	//private static ArrayList<Integer>collection;
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		
		for(Integer i:a) {
			System.out.println(i);
		}
		
	int element=Collections.max(a);
	System.out.println("this is maximum element:"+element);
	
	
	int Element=Collections.min(a);
	System.out.println("This is Minimum element:"+Element);
	
		
		
	}

}
