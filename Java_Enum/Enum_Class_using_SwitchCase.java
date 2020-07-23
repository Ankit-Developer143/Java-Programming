package Java_Enum;
enum Size2{
	   SMALL, MEDIUM, LARGE, EXTRALARGE;

	   public String getSize() {

	   // this will refer to the object SMALL
	      switch(this) {
	         case SMALL:
	          return "small";

	         case MEDIUM:
	          return "medium";

	         case LARGE:
	          return "large";

	         case EXTRALARGE:
	          return "extra large";

	         default:
	          return null;
	      }
	   }
}
 class Enum_Class_using_SwitchCase {
	public static void main(String[] args) {
		System.out.println(Size2.EXTRALARGE.getSize());
		
	}

}//op:-extra large
