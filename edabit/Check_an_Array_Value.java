package edabit;

public class Check_an_Array_Value {
	 public static boolean check(int[] arr,int el) {
		 for(int result : arr) {
			 if(result == el) {
				 return true;
			 }
			 
		 }
		 return false;
		 
	 }
	 public static void main(String[] args) {
		 int [] arr = {1,2,3,4};
		 
		 Check_an_Array_Value c = new Check_an_Array_Value();
		 System.out.println(c.check(arr, 5));
	 }
	 
}
		 
		 
		 
		 
