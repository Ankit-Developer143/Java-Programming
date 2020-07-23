package Some_Basic;

//Class
public class NonParametrised {
	int id ;
	String Name;
	//Class Name and parameter name Should be same 
	NonParametrised(){
		this.id = 2;
		this.Name = "Shivam";
	}
	//This is the Method 
	void Print() {
		System.out.println("My Name is " +Name+ " And my id is "+id);
	}
		
	public static void main(String[] args) {
		NonParametrised obj = new NonParametrised();
		obj.Print();
		
	}
	
}//op:-My Name is Shivam And my id is 2
		
	
	
