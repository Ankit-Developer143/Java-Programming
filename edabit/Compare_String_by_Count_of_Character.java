package edabit;

public class Compare_String_by_Count_of_Character {
	public static boolean comp(String str1, String str2) {
		if(str1.length() == str2.length()){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args) {
	Compare_String_by_Count_of_Character c = new Compare_String_by_Count_of_Character();
	System.out.println(c.comp("Ankit", "Singh")); //true
		
		
	}

}
