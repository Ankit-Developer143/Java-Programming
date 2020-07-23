package StringHandling;

public class LoopCoderDemo {
public static void main(String[] args) {
	String s="coder technologies";
	try {
	String [] a=s.split(" ");
	for(int i=0;i<s.length();i++) {
		
	
			System.out.println(a[i]);
	}
	}
	catch(Exception e) {
		System.out.println(e);
	}
			
		
		System.out.println();
	}
	
}

