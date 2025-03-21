package j05_classMethod;

public class Car {
	public int speed;
	public int price;
	public String color = "Red";

	public void isOff() {
		System.out.println("시스템 on");
	}

	public void speedUp() {
		speed += 10;
	};
	public void speedDown() {
		speed -= 10;
	};
	@Override
	public String toString() {
		return "Car [speed=" + speed + ", price=" + price + ", color=" + color + "]";
	}

}
