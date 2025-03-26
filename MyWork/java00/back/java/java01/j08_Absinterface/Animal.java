package j08_Absinterface;

abstract public class Animal {
	 String kind;
	 
	 public Animal(){
		 System.out.println("Animal 생성");
	 };
	 void breath() {
		 System.out.printf("%s는 숨을 쉽니다.\n",kind);
	 }
	 abstract void sound();
	 
	 public static void main(String[] args) {
			Animal animal = new Dog();
			
			animal.breath();
			animal.sound();
			
			Cat cat = new Cat();
			Dog dog = new Dog();
			
			cat.eyeColor(); // cat만 가지고 있는 메서드
			dog.speed();    // dog만 가지고 있는 메서드
			
			
			animal = new Cat();
			
			animalUse(animal);
	 }	
	 public static void animalUse(Object animal) {
			System.out.println(animal);
		}
}
class Cat extends Animal{
	@Override
	void sound() {
		System.out.println("야옹");
	}
	
	Cat(){
		super.kind = "고양이";
	}
	
	void eyeColor() {
		System.out.println("~eyeColor가 멋지다.");
	}
	
}

class Dog extends Animal{
	
	Dog(){
		super.kind = "강아지";
		System.out.println("Dog 기본생성자");
	}
	
	@Override
	void sound() {
		System.out.println("멍멍");
	}
	
	void speed() {
		System.out.println("강아지는 잘 달린다.");
	}
	

}