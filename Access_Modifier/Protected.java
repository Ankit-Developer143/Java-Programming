package Access_Modifier;
//Method and data member are declared as a protected.we can access them within Same Package 

//as well as Sub-Class

//Class
class Demo {
	protected void display() {
		System.out.println("class");
	}

}

//Sub-Class
class Protected extends Demo {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.display();

	}

}
//op:-class
