package j05_classMethod;

public class Ex01_CarUser {
	public static void main(String[] args) {
		Car car = new Car();
		
		car.color= "blue";
		car.price=10000;
		car.speed = 10;
		System.out.println(car.speed);
		
		car.speedUp();
		System.out.println(car.speed);
		System.out.println(car);
	}
}
