package Overloading_Overriding;
class Bmw{
	public int speedLimit() {
		return 100;
	}
}
class ford extends Bmw{
	public int speedLimit() {
		return 200;
		
	}
}

public class overriding_Demo1 {
	public static void main(String[] args) {
		ford f=new ford();
		int num=f.speedLimit();
		System.out.println(num);
	}

}
