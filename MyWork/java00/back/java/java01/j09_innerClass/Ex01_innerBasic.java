package j09_innerClass;

import j05_classMethod.Car;
import j09_innerClass.OuterClass.Inner;

//** 클래스 맴버
//=> 맴버(전역) 변수 : 선언문, 초기화블럭 
//=> 메서드 : 생성자, main, setter/getter, toString, 일반메서드
//=> 초기화블럭 : { ... }  / static { ... }
//=> 내부(inner) 클래스 : 클래스 내부에 다른 클래스를 정의

//** Inner Class 기본형식과 특성
class OuterClass {
	//1) 맴버(전역) 변수
	int age=22;
	private String name="홍길동";
	static String country = "Korea";
	
	//=> 맴버변수 정의
	//=> has-a 관계: 재사용성이 많은 경우	
	//   inner 클래스와 비교: 현재클래스에서만 필요한 경우
	//	(단, inner 클래스가 외부에서 접근불가능한 맴버는 아님)
	Car car;
	
	//2) 생성자
	OuterClass() { System.out.println("** OuterClass 기본생성자 **"); }
	
	//3) innerClass (내부클래스)
	//=> 일반적인 클래스의 특징을 모두가짐
	//=> 장점: 외부클래스의 모든맴버(private 포함) 접근가능
	class Inner {
		String addr="성남";
		static String color="Black"; 
		//=> Inner 클래스에서 static 맴버를 정의 하려면 static Inner 클래스로 정의해야함.
		//   단, Java 16 부터는 허용됨.
		
		Inner() { System.out.println("** Inner 기본생성자 **"); }
		Inner(String addr) { 
			this.addr=addr;
			System.out.println("** Inner 초기화 생성자 **"); 
		}
		
		void printData() {
			System.out.printf("* Inner printData: age=%d, name=%s, coutry=%s, addr=%s \n"
					, age, name, country, addr);
		}
		
	}//Inner
	
} //OuterClass

public class Ex01_innerBasic {

	public static void main(String[] args) {
		//1. Outer 만 생성
		//=> Outer 의 맴버만 접근 가능
		OuterClass out1 = new OuterClass();
		out1.car=new Car();
		System.out.printf("* main age=%d, country=%s, out1.car.color=%s \n"
						, out1.age, OuterClass.country, out1.car.color );
		
		//2. Inner 생성
		//=> Inner 스스로 직접생성은 불가능하며, Outer 의 인스턴스를 통해 생성됨
		//=> import 사용
		//	 import j09_innerClass.OuterClass.Inner;
		//	 -> Type 정의할때 Inner 단독사용가능
		OuterClass.Inner in1 = out1.new Inner();
		in1.printData();
		
		OuterClass.Inner in2 = out1.new Inner("용인");
		in2.printData();
		
		//=> Outer 인스턴스 없이 생성
		//=> import 사용
		Inner in3 = new OuterClass().new Inner("서울");
		in3.printData();
		
		//=> Inner 의 static 맴버접근 
		//   OuterClass.Inner.color (단, import 했으므로 Inner.color 도 가능함)
		System.out.println("* main Inner 의 static 맴버접근 => "+ Inner.color );

	} //main
} //class
