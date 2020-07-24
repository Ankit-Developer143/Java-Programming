package edabit;

public class concatination_FirstElement_And_LastElement {
	public static String concatName(String firstName, String lastName) {
		return (lastName+"," +firstName);
		
		
	};
	public static void main(String[] args) {
		concatination_FirstElement_And_LastElement obj = new concatination_FirstElement_And_LastElement();
		System.out.println(obj.concatName("Ankit", "Singh"));
			
		}
	}//op:-Ankit,Singh


