package All_Interview_tecnical;

public class ChangeString_Sachin {
	public static void main(String[] args) {
		String s1="Sachin Tendulkar";
		String s2[]=s1.split(" ");
		for(int i=s2.length-1;i>=0;i--) {
			System.out.println(s2[i]+" ");
			
		}
	}

}
