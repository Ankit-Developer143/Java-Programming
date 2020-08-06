package edabit;

public class onoff_switch {
public static int posCom(int n) {

		int result = (int) Math.pow(2, n);
		return result;
		
	}	

	public static void main(String[] args) {
		onoff_switch o = new onoff_switch();
		System.out.println(o.posCom(10));
	}

}//op:-1024
