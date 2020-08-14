package edabit;

public class Square_And_Cube {
	public static int cubeSquareRoot(int num) {
	
		 return (int) Math.sqrt(Math.pow(num, 3));
		
	  }
	public static void main(String[] args) {
		Square_And_Cube s = new Square_And_Cube();
	   System.out.println( s.cubeSquareRoot(81));
	}//op:-729

}
