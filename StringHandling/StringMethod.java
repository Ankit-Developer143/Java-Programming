package StringHandling;

public class StringMethod {
	public static void main(String[] args) {
		
		String s="Java";
		String s1="java";
		String s3="rose is red";
		String s4="rose is red,blood is red";
		
		
		//concat
		System.out.println(s.concat(" " +s1));//Java java
		
		//charAt
		System.out.println(s3.charAt(0));//r
		System.out.println(s4.charAt(9));//e
		
		
		//startsWith
		System.out.println(s.startsWith("J"));//true
		
		//endsWith
		System.out.println(s.endsWith("a"));//true
		
		//replace
		System.out.println(s.replace("Java", "Hello"));//Hello
		
		
		//subString
		System.out.println(s3.substring(4));// is red
		
		//toUpperCase
		System.out.println(s1.toUpperCase());
		
		
		
		
		
		
		
		
		
		
		
	}

}
