package edabit;

public class Correct_String {
public static void correctStream(String[] user, String[] correct) {
	int result [] = new int[user.length];
	for(int i =0;i<user.length;i++) {
	if(user[i] ==  correct[i]) {
		result[i] = 1;
	}else {
	     result[i] = -1;
	}
	System.out.println(result[i]);
			
			
		}
}

	
	
	public static void main(String[] args) {
		String user[] = {"cat", "blue", "skt", "umbrells", "paddy"};
		String correct [] = {"cat", "blue", "sky", "umbrella", "paddy"};
		Correct_String c = new Correct_String();
		c.correctStream(user, correct);
	}

}
/*
 * op:-    1 1 -1 -1 1
 */
