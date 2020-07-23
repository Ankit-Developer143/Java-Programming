package All_Basic_Operation;
class Test2{
	private String Name="Ankit";
	private String CollegeName="Patkar Varde";
	public String getName() {
	return Name;
}
	protected void setName(String Name) {
		this.Name=Name;
		
	}
	public String getCollegeName() {
		return CollegeName;
	}
	public void setCollegeName( String CollegeName) {
		this.CollegeName=CollegeName;
	}
	void does() {
		System.out.println("Getter Setter Method Demo");
	}
}
class JavaDemo extends Test2{
	String mainSubject="Physics";
}


public class Getter_Setter_Inheritance_Demo {
	public static void main(String[] args) {
		JavaDemo jd=new JavaDemo();
		System.out.println(jd.getName());
		System.out.println(jd.getCollegeName());
		System.out.println(jd.mainSubject);
		jd.does();
	}

}
