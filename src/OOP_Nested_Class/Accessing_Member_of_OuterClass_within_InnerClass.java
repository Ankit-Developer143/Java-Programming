package OOP_Nested_Class;

class Car {
	String carName;
	String carType;

//assign values using constructor
	public Car(String carName, String carType) {
		this.carName = carName;
		this.carType = carType;

	}

	private String getCarName() {
		return this.carName;

	}

	class Engine {
		String engineType;

		void setEngine() {

			// Accessing the Car properties
			if (Car.this.carType.equals("4wd")) {

				// invoking the method getCarName()
				if (Car.this.getCarName().equals("Crysler")) {
					this.engineType = "Smaller";

				} else {
					this.engineType = "Bigger";
				}

			} else {
				this.engineType = "Bigger";
			}
		}

		String getEngineType() {
			return engineType;
		}
	}
}

public class Accessing_Member_of_OuterClass_within_InnerClass {
	public static void main(String[] args) {
		Car c = new Car("Crysler", "4wd");
		Car.Engine e = c.new Engine();
		e.setEngine();
		System.out.println(e.getEngineType());

	}

}// op:-Smaller
