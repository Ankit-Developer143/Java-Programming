package edabit;

public class Switch_on_off {
public static int posCom(int n) {
	int result = 1;
		for(int i = 0;i<n;i++) {
			result =  result*2;
			
		}
		return result;
	}
	public static void main(String[] args) {
		Switch_on_off s = new Switch_on_off();
		System.out.println(s.posCom(3));
	}

}
