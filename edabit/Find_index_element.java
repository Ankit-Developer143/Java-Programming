package edabit;

public class Find_index_element {
public static int findIndex(String[] arr,String str) {
	for (int i = 0; i < arr.length; i++) {
	if(arr[i].contains(str)) {
		return i;
	}
	
	}
	return 0;
	}
public static void main(String[] args) {
	String []arr = {"one", "two","three","Four","Five"};
	
	Find_index_element f = new Find_index_element();
	
	System.out.println(f.findIndex(arr, "Eight"));
}

}
