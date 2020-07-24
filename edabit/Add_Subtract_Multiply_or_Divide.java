package edabit;

/*Write a function that takes two numbers and returns
if they should be added, subtracted, multiplied or divided to get 24.
If none of the operations can give 24, return "none".*/

public class Add_Subtract_Multiply_or_Divide {
	public  String getValue(int a,int b) {

	/*
	 * if(a%b ==24|| a/b ==24 || a+b ==24|| a-b ==24) { return "24"; } return null;
	 * 
	 * }
	 */
		if(a+b ==24){
			return "added";
			
		}
		else if(a-b ==24){
			return "subtracted";
			
		}
		else if(a/b ==24) {
			return "divided";
		}
		else if(a*b == 24){
			return "multiplied";
			
		}
		return "none";
		
	}
	public static void main(String[] args) {
		Add_Subtract_Multiply_or_Divide a =new Add_Subtract_Multiply_or_Divide();
	System.out.println(	a.getValue(11, 11));
		
	}
	

}
