package edabit;

public class String_Smaller_Number {
public static String smallerNum(String n1, String n2) {
	int a = Integer.parseInt(n1);
	int b = Integer.parseInt(n2);
	String result = "";
	if(a>b) {
		result += b;
	}
	else {
		result +=a;
	}
	return result;
	
		
	}
	public static void main(String[] args) {
		String_Smaller_Number s = new String_Smaller_Number();
		System.out.println(s.smallerNum("1500", "1"));
	}

}
