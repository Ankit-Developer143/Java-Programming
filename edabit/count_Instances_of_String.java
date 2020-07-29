package edabit;

public class count_Instances_of_String {
public static int charCount(char c, String str) {
	int count = 0;
	for (int i = 0; i < str.length(); i++) {
		if(str.charAt(i) == c) {
			count ++;
			
		}
	
	
}
	return count;
	
}
	public static void main(String[] args) {
		count_Instances_of_String c =new count_Instances_of_String();
		System.out.println(c.charCount('a', "edabit"));
		
	}

}
