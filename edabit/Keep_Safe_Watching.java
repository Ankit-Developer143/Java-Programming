package edabit;

public class Keep_Safe_Watching {
public static String preventDistractions(String args) {
	if(args.contains("vines") || args.contains("anime") || args.contains("meme") ||args.contains("roasts") || args.contains("Danny DeVito") ) {
		return "NO!";
	} 
	return "Safe watching!";
		
	}	
public static void main(String[] args) {
	Keep_Safe_Watching k = new Keep_Safe_Watching();
	System.out.println(k.preventDistractions("Hot pictures of Danny DeVito"));
}

}
