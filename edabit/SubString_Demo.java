package edabit;

public class SubString_Demo {
public static String formatDate(String date) {
	String result =  date.substring(6, 10)+date.substring(3, 5)+date.substring(0,2);
	

	return result;
	
			
		
	}
	public static void main(String[] args) {
		
		SubString_Demo  s = new SubString_Demo();
		System.out.println(s.formatDate("11/12/2019"));
		
		
		}
	//op:-20191211

}
