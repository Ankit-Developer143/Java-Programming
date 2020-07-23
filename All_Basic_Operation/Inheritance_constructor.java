package All_Basic_Operation;
//Is- a relationship PhysicsTeacher is a teacher 
class Teacher{
	String Designation="Teacher";
	String CollegeName;
	//String CollegeName="Patkar";
	void does() {
		System.out.println("Teaching");
	}
	
}
class PhysicsTeacher extends Teacher{
	String mainSubject="physics";
}

public class Inheritance_constructor {
	public static void main(String[] args) {
		
		PhysicsTeacher p=new PhysicsTeacher();
		//System.out.println(p.CollegeName);
		System.out.println(p.Designation);
		System.out.println(p.mainSubject);
		p.does();
		
		//Another way
		System.out.println(p.CollegeName="Patkar Varde");
	}

}
