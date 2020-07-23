package Access_Modifier;

//Whenever varible and method declared as a Private they cannot access outSide of the Class
//in this case we use getter and setter Method 
class test {
	private String name;
	private int id;
	private String stream;

	// getter
	public String getName() {
		return this.name;

	}
	// setter

	public void setName(String name) {
		this.name = name;
	}

//getter
	public float getId() { // here any numeric data type are applicable
		return this.id;

	}

//setter
	public void setId(int id) {
		this.id = id;

	}

//getter
	public String getstream() {
		return this.stream;
	}

//setter
	public void setstream(String stream) {
		this.stream = stream;

	}

}

public class Private_Demo {
	public static void main(String[] args) {
		test t = new test();
		t.setName("Ankit");
		t.setId(2);
		t.setstream("Science");

		System.out.println(t.getName());//Ankit
		System.out.println(t.getId());//2.0
		System.out.println(t.getstream());//Science

	}

}
