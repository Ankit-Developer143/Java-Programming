package Collection;


import java.util.ArrayList;
import java.util.List;

class Book1{
	int id;
	String Name;
	String Author;
	int Quantity;
	
	
	Book1(int id,String Name,String Author,int Quantity){
		this.id=id;
		this.Name=Name;
		this.Author=Author;
		this.Quantity=Quantity;
		
	}
}

public class List_Book_Example {
	public static void main(String[] args) {
		List<Book1> li=new ArrayList<Book1>();
		Book1 b1=new Book1(101, "Ankit", "Ram", 1);
		Book1 b2=new Book1(102, "Dinesh", "DinDyal", 2);
		
		li.add(b1);
		li.add(b2);
		
		for(Book1 b:li) {
System.out.println(b.id+""+b.Name+""+b.Author+""+b.Quantity);  
			
		}
	}

}
