package edabit;

public class Hamming_Distance {
	public static int hammingDistance(String str1, String str2) {
	int count = 0;
	for(int i = 0; i < str1.length(); i++){
		if(str1.charAt(i) != str2.charAt(i)) count++;
	}
	return count;
}
	public static void main(String[] args) {
		Hamming_Distance  h = new Hamming_Distance();
		System.out.println(h.hammingDistance("song", "sung"));
	}//op:-1

}
