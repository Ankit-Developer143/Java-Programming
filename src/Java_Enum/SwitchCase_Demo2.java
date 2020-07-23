package Java_Enum;

/*Size pizzaSize;
 * Here, pizzaSize is a variable of the Size type. It can only be assigned with 4 values.

pizzaSize = Size.SMALL;
pizzaSize = Size.MEDIUM;
pizzaSize = Size.LARGE;
pizzaSize = Size.EXTRALARGE;*/
enum Size1 {
	SMALL, MEDIUM, LARGE;
}

class Test {
	Size1 pizzaSize;

	public Test(Size1 pizzaSize) {
		this.pizzaSize = pizzaSize;
	}

	public void orderPizza() {
		switch (pizzaSize) {
		case SMALL:
			System.out.println("I order SMALL Size Pizza");
			break;
		case MEDIUM:
			System.out.println("I order MEDIUM Size Pizza");
			break;
		case LARGE:
			System.out.println("I order LARGE Size Pizza");

		}
	}
}

public class SwitchCase_Demo2 {
	public static void main(String[] args) {
		Test t = new Test(Size1.SMALL);
		t.orderPizza();
	}

}
