package Abstract_And_Interface;
interface Vehicle{
	void changeGear(int a);
	void speedUp(int a);
	void applyBrakers(int a);
}
class Bicycle implements Vehicle{
int speed;
int gear;
	@Override
	public void changeGear(int newGear) {
		
		gear=newGear;
	}

	@Override
	public void speedUp(int increment) {
		speed=speed+increment;
		
	}

	@Override
	public void applyBrakers(int decrement) {
		speed=speed-decrement;
	}
	public void Display() {
		 System.out.println("Gear:"+gear+"SpeedUp:"+speed+"Applyagear:"+speed);
	}
	
}
class Bike implements Vehicle{
int gear;
int speed;

	@Override
	public void changeGear(int newGear) {
		gear=newGear;
		
		
	}

	@Override
	public void speedUp(int increment) {
		speed=speed+increment;
		
	}

	@Override
	public void applyBrakers(int decrement) {
		speed=speed-decrement;
		
	}
	public void Display() {
	 System.out.println("Gear:  "+gear+"SpeedUp:"+speed+"Applyagear:"+speed);
		
		
	}
	
}

public class RealLife_ExampleInterface {
	public static void main(String[] args) {
		Bicycle b=new Bicycle();
		b.changeGear(10);
		b.speedUp(20);
		b.applyBrakers(5);
		b.Display();
		 
		
	}

}
