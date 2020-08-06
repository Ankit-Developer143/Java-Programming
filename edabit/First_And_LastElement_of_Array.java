package edabit;

public class First_And_LastElement_of_Array {
public static String firstLast(String[] arr) {
	//String []result = new String [arr.length];
	String result = " ";
	for (int i = 0; i < arr.length; i++) {
        String first = arr[0];
        String last = arr[arr.length-1];
        result = first+ " " + last;
     

    }
	return result;
	
	}
public static void main(String[] args) {
String []arr = {"one", "two","three","Four","Five"};
	First_And_LastElement_of_Array f = new First_And_LastElement_of_Array();
	System.out.println(f.firstLast(arr));
	
	
}
}
