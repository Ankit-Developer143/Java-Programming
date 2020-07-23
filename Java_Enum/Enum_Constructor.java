package Java_Enum;

enum Size3 {

	// enum constants calling the enum constructors
	SMALL("The Size is Small."), 
	MEDIUM("The size is medium."), 
	LARGE("The size is large."),
	EXTRALARGE("The size is extra large.");
	
   //pizzaSize having all the values bcoz this is the variable of Size3  Class
	private final String pizzaSize;

	// private enum constructor
	private Size3(String pizzaSize) {
		this.pizzaSize = pizzaSize;
	}

	public String getSize() {
		return pizzaSize;
	}
}

public class Enum_Constructor {
	public static void main(String[] args) {
		Size3 s = Size3.EXTRALARGE;
		System.out.println(s);
		

	}//op:EXTRALARGE

}
