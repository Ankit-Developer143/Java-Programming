package Java_Enum;

/*In Java, an enum (short for enumeration) is a type that has a fixed set of possible values.
We use the enum keyword to declare enums
Note: The enum constants are usually represented in uppercase.*/
enum Size {
	SMALL, MEDIUM, LARGE;
}

public class Enum_Demo1 {
	public static void main(String[] args) {
		System.out.println(Size.SMALL);
		System.out.println(Size.MEDIUM);
		System.out.println(Size.LARGE);

	}

}/*
 * op:- SMALL MEDIUM LARGE
 */
