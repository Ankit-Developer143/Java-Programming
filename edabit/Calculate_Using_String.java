package edabit;

public class Calculate_Using_String {
	public static int calculate(int num1, int num2, String operation) {
		int result = 0;
		 if (operation.equals("+")) { 
		        result= num1 + num2; 
		 }
		      else if (operation.equals("-")) { 
		    	  result =  num1 - num2;
		      }
		      else if (operation.equals("*")) { 
		    	  result =  num1 * num2; 
		      }
		      else if (operation.equals("/")) { 
		    	  result =  num1 / num2; 
		      }
		      else if (operation.equals("%")) { 
		    	  result =  num1 % num2; 
		      }
		return result;
		    } 
		
	  
	public static void main(String[] args) {
		Calculate_Using_String c = new Calculate_Using_String();
		System.out.println(c.calculate(5, 5, "-"));
	}

}
