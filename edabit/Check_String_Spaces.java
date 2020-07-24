package edabit;

public class Check_String_Spaces {
	public static boolean getSpaces(String name) {
		if (name.contains(" ")) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		Check_String_Spaces c = new Check_String_Spaces();
		System.out.println(c.getSpaces("Ankit Singh"));

	}// op:-true

}
