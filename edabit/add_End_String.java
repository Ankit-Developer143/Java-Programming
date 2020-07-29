package edabit;

public class add_End_String {
public static String[] addEnding(String[] arr, String ending) {
		String result = arr.toString();
		result.concat(ending);
		
		return result;
	}
}
	public static void main(String[] args) {
		String arr[] = {"new", "pander", "scoop"};
		add_End_String a =new add_End_String();
		
		System.out.println(a.addEnding(arr, "er"));
		
	}

}
