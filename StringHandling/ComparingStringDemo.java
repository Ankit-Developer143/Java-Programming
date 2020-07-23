package StringHandling;



public class ComparingStringDemo {
	public static void main(String[] args) {
		
	
	
	String s=new String("Hello");
	String s1=new String("Coder");
	String s3=new String("Technology");
	
	
	String s4="Hi";
	String s5="Hey";
	String s6="Hey";
	
	
	String s7=new String("Hello");
	String s8=new String("hello");
	String s9=new String("Hey");
	
	
	
	//==
	System.out.println(s==s1);///false
	System.out.println(s==s7);//false
	System.out.println(s5==s6);//true
	
	
	//equals
	System.out.println(s.equals(s7));//true
	System.out.println(s5.equals(s6));//true
	System.out.println(s.equals(s8));//false
	
	//equalsIgnoreCase
	System.out.println(s.equalsIgnoreCase(s8));//true
	System.out.println(s5.equalsIgnoreCase(s9));//true
	
	//concat
	System.out.println(s1.concat(s3));//CoderTechnology
	
	//contains also compare to string
	System.out.println(s.contains(s8));//false compare
	
	
	//compareTo
	System.out.println(s8.compareTo(s7));//32 if same 0 upper to lower -32
	
	//compareToignore
	System.out.println(s7.compareToIgnoreCase(s8));//0 all are ignore
	
	
	
	
	
	
	
	}
	

}
