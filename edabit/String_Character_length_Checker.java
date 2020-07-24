package edabit;

public class String_Character_length_Checker {
	public static boolean getStr(String str1,String str2) {
	boolean result = str1.length() == str2.length()?true:false;
	return result;
	
		
	}
	public static void main(String[] args) {
		String_Character_length_Checker obj = new String_Character_length_Checker();
		System.out.println(obj.getStr("Anki","Singh"));
		
	}

}
