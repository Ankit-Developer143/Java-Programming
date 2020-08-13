package edabit;

public class ReplaceString {
public void hackerSpeak(String str) {
	
	String result =str.replaceAll("s", "5").replaceAll("o","0").replaceAll("e", "3").replaceAll("i", "1").replaceAll("a", "4");
	System.out.println(result);
	}
	public static void main(String[] args) {
		String str = "Hello";
		ReplaceString  r = new ReplaceString ();
		r.hackerSpeak(str);
		
	}

}
