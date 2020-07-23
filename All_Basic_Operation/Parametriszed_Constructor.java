package All_Basic_Operation;

class Employee{
	int empid;
	String Name;
	
	Employee(int empid,String Name){
		this.empid=empid;
		this.Name=Name;
		
		
		
	}
	void Display() {
		System.out.println("Employee Id:"+empid);
		System.out.println("Employee Name: "+Name);
	}
	
	
}


public class Parametriszed_Constructor {
	public static void main(String[] args) {
		
	
	Employee e=new Employee(1, "Ankit");
	e.Display();
	}
}
