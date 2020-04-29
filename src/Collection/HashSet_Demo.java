package Collection;
//Accept Null Values
import java.util.HashSet;

class book{
	int id;
	String Name;
	String Publisher;
	int Quantity;
	public book(int id,String Name,String Publisher,int Quantity) {
		this.id=id;
		this.Name=Name;
		this.Publisher=Publisher;
		this.Quantity=Quantity;	
	}
	}
public class HashSet_Demo {
	public static void main(String[] args) {
		HashSet<book> hs=new HashSet<book>();
		
		
		book b=new book(101,"Ankit","Dsoza",4);
		book b1=new book(102,"Ram","Priyanka",5);
		
		
		hs.add(b);
		hs.add(b1);
		
		
		for(book s:hs) {
			System.out.println(s.id+""+s.Name+""+s.Publisher+""+s.Quantity);
		}
		
	}
	
	

	
	}




