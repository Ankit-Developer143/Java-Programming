package righttoleft;

public class RightToLeft {



 char tmp;
 int i;
 String prod[][] = {{"S", " ", "B"},
 {"B", "b", "D"},
 {"D", "b", "B"},
 {"S", "a", "B"},
 {"B", "a", " "}};

 void PrintNonTerminal() {

 System.out.println("\tNon Terminals are;" + "S,B,D");
 
 }
 
 void PrintTerminal() {
 System.out.println("\tTerminals are;a,b");
 
 }
 void PrintProductions() {
 int i;

 System.out.println("\t Conversion of Right to Left Linear Grammer: ");
 
 System.out.println("\tProductions are");
 
 for (i = 0; i < 5; i++)
 {
 if (prod[i][1] == " ") //
 {
 System.out.println("\t"     + prod[i][0] +     " -->"     + "l" +    prod[i][2]);
 
 
 } else if (prod[i][2] == " ")
 {
 prod[i][2] = "Z";  //
 System.out.println("\t" + prod[i][0] + " --> " + prod[i][1] + "Z");
 } else
 {
 System.out.println("\t" + prod[i][0] + " --> " + prod[i][1] + prod[i][2]);
 }
 }
 }   
 
 
 
 
 
 void PrintLeft2RightLinear() {
 int i;
 System.out.println("\t" + "Left Linear Grammer:");
 System.out.println("\t" + "=============================");
 for (i = 0; i < 5; i++)
 {
 String tmp = prod[i][1];
 prod[i][1] = prod[i][2];
 prod[i][2] = tmp;
 System.out.println("\t" + prod[i][0] + " --> " + prod[i][1] + prod[i][2]);
 }
 }
 public static void main(String[] args) {
 RightToLeft r = new RightToLeft();
 r.PrintProductions();
 r.PrintNonTerminal();
 r.PrintTerminal();
 r.PrintLeft2RightLinear();
 
 System.out.println("Practical performed by: Ankit, Roll No.32");
 }
}
 
 
 
