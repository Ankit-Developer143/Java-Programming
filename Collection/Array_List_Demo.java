package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class Array_List_Demo {
public static void main(String[] args) {
	
	ArrayList<Integer> a=new ArrayList<Integer>();
	a.add(10);
	a.add(20);
	a.add(30);
	a.add(40);
	a.add(50);
	
	System.out.println("*********Displaying Element*************");
	for(Integer l:a) {
		System.out.println(l);
	}
	System.out.println("The Size of Array is:\n"+a.size());
	
	
	System.out.println("*****Find Maximum Value In the Array**************");
	int b=Collections.max(a); //always take array values not for each value consider
	System.out.println(b);
	
	System.out.println("******Find Minimum Value In The Array*************");
	
	int b1=Collections.min(a);
	System.out.println(b1);

	
	System.out.println("************Remove The Value From Array**********");
	a.remove(2);
	System.out.println(a);
	
	System.out.println("********************Iterator Method**************");
	
	ListIterator li=a.listIterator(); //Taking a reference from Array List
	                                  //Second Method To Print Array Values
	
	while(li.hasNext()) {
		System.out.println(li.next());
	}
	
	 System.out.println("************Update Element**************************");
	
	 a.add(2, 30);
	 System.out.println(a);
	
	
	 ArrayList<String> fruits = new ArrayList<String>();
	 fruits.add("Banana");
	 fruits.add("Apple");
	 fruits.add("Pineapple");
	 fruits.add("Orange");
	 
	 System.out.println("********Fetch The Value Using ref.get()  method*******");
	 String str= fruits.get(2);
	 System.out.println(str);

	 System.out.println("****************Sorting Technique**********************");
	 
	 Collections.sort(fruits);
	 System.out.println(fruits);
	 
	 System.out.println("*********.isEmptyMethod*****************************");
	 System.out.println(a.isEmpty());
	 
	 System.out.println("********Contains*************************************");
	 System.out.println(fruits.contains(a));//check whether Matching or Not
	 
	 System.out.println("**********Indexof**************************************");
	 System.out.println(fruits.indexOf("Apple"));//check The index Value
}

}
