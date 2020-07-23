package Access_Modifier;

//when variable and method  and so on declared as a  public then it can be access them from anywhere

//the public access modifier has no scope restrication

public class Public_Demo {
	public int legCount;

	public void display() {
		System.out.println("I am an Animal");

		System.out.println("I have " + legCount + " legs");
	}

	public static void main(String[] args) {
		Public_Demo p = new Public_Demo();
		p.legCount = 4;
		p.display();

	}

}
/*
 * I am an Animal 
 * I have 4 legs
 */
