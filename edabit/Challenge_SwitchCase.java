package edabit;


		public class Challenge_SwitchCase {
			public static String helloName(String name) {
				String result = "";
				switch( name){
					case "Gerald":
						result += "Hello Gerald!";
						break;
					case "Tiffany":
						result += "Hello Tiffany!";
						break;
					case "Ed":
						result += "Hello Ed!";
						default:
							return null;
				}
				return result;
			}
			public static void main(String[] args) {
				Challenge_SwitchCase c = new Challenge_SwitchCase();
				System.out.println(c.helloName("fatima"));
			}
		
	

}
