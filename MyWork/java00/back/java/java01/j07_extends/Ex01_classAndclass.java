package j07_extends;

import j05_classMethod.Car;

class SportsCar extends Car{
	int turbo;
	
	SportsCar(){
		System.out.println("SportsCar 인스턴스 생성");
	}
}//SportsCar
public class Ex01_classAndclass {
	public static void testCat(Car car) {
		car.color = "blue";
		System.out.println("use관계 car.color=>"+ car.color);
	}
	public static void main(String[] args) {
		Student s1 = new Student("s001","홍길동",100);
		System.out.println(s1);
		System.out.println(s1.car.color);
		
		Car sCar = new SportsCar();
		System.out.println(sCar.color);
	}
	
}
