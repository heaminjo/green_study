package j07_extends;

class Animal{
	String name;
	static int legs =1;
	
	Animal(){System.out.println("Animal 기본 생성자");}
	
	
	public Animal(String name, int legs) {
		this.name = name;
		Animal.legs = legs;
	}


	//호흡
	void breathing() {
		System.out.println(name+ "은 호흡을 한다.");
	}
	//다리
	void legs() {
		System.out.printf("%s은 %d개의 다리가 있다.",name,legs);
	}
	
}
//포유류
class Mammal extends Animal{
	String cry; //울음 소리
	int legs = 100;// 조상과 같은 이름의 변수도 정의 가능하다.
	public Mammal() {}
	
	public Mammal(String cry, int leg,String name){
		super(name,leg);
		this.cry = cry;
	};	
	
	void crying() {
		System.out.printf("%s는 %s 소리를 내며 웁니다.\n",name,cry);
	}
	public int getLegs() {
		return this.legs;
	}
}
//파충류
class Reptile extends Animal{
	
	public Reptile() {System.out.println("Reptile 기본 생성자");};
}

class WildAnimal extends Mammal{
	
}

class PetAnimal extends Mammal{
	
	
	public PetAnimal() {}
	
	int age = 10;
//	public PetAnimal(int legs,String cry,String name) {
//		this.cry = cry;
//		this.name=name;
//		Animal.legs = legs;
//	}
	
	public PetAnimal(int legs,String cry,String name) {
		super(cry,legs,name);
	}
	
	void legsPrint(int legs) {
		System.out.println(this.legs+""+super.legs);
	}
	void checking() {
		System.out.printf("%s는 건강검진을 했다.\n",name);
	}
	
	//상속 받은 모든 메서드
	void infoPrint() {
		crying();
		breathing();
		checking(); 
		legs();
	}
	
	public static void test() {
		System.out.println(this.age,super.legs);
	}
}
public class Ex02_AnimalTest {
	public static void main(String[] args) {
//		PetAnimal dog = new PetAnimal(4,"멍멍","강아지");
//		
//		dog.infoPrint();
		Reptile r = new Reptile();
		PetAnimal cat = new PetAnimal(4,"야용","고양이");
		cat.legsPrint(100);
	}
}