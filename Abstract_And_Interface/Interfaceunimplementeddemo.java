package Abstract_And_Interface;
//if two metod have same name then its give only one unimplemented method
interface Animals{
	void food();
}
interface Bird{
	final int a=10;
	void eat();
}
interface Cat{
	void run();
} 
interface Dogs{
	public void  clever();
	
}

interface E extends Cat,Bird,Animals,Dogs{
	
		
	
}
class F implements E{

	@Override
	public void run() {
		System.out.println("Animal run");
		
	}

	@Override
	public void eat() {
		System.out.println("Bird Are Eat");
		System.out.println(a);
		
	}

	@Override
	public void clever() {
		System.out.println("Its Clever");
	}

	@Override
	public void food() {
		System.out.println("need More Foods");
	}
}

public class Interfaceunimplementeddemo {
public static void main(String[] args) {
	F f=new F();
	f.run();
	f.eat();
	f.clever();
	f.food();

	
	
	
	

	
}

}
