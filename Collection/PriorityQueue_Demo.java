package Collection;
//The PriorityQueue class implements the Queue interface. 
//PriorityQueue doesn't allow null values to be stored in the queue.
//It holds the elements or objects which are to be processed by their priorities
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue_Demo {
	public static void main(String[] args) {
		PriorityQueue <String> pq=new PriorityQueue<String>();
		pq.add("Ankit");
		pq.add("Ram");
		pq.add("Shyam");
		pq.add(null);//not accaptable
		System.out.println("Head:"+pq.element());
		System.out.println(("Head:"+pq.peek()));
		System.out.println("Head:"+pq.size());
		Iterator<String> i=pq.iterator();
		System.out.println(pq);
		while(i.hasNext()) {
			System.out.println("All Method Print"+i.next());
		}
		
	System.out.println(pq.remove());
	System.out.println(pq);//[Ram, Shyam]
	System.out.println(pq.poll());//Ram
		
		
	}

}
