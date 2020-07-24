package edabit;

public class Slice_of_Pie {
	public static boolean equalSlices(int total, int people, int each) {
		if(people*each<=total) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		Slice_of_Pie t = new Slice_of_Pie();
	System.out.println(t.equalSlices(0, 0, 0));

	}

}
