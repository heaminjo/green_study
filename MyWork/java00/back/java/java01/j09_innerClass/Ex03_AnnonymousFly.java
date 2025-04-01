package j09_innerClass;

//** 익명클래스 (Anonymous 클래스)
//=> 이름이 없는 클래스이며, 한번만 사용하고 버려지는 객체를
//	 사용할때 유용하게 쓰이는 Local 내부클래스로서,
//	 다른 클래스를 상속받는 경우 또는 인터페이스를 구현하는 경우 이용됨  

interface Flyer { void fly(); } //Flyer

//1. 일반적인 방법
//=> 구현클래스를 만들어 놓고 필요시 사용: 재사용성이 높은경우
class FlyerImpl implements Flyer {
	@Override
	public void fly() {
		System.out.println(" 1. 일반적인 방법 => 구현클래스작성 (재사용 가능)");
	}
} //FlyerImpl

public class Ex03_AnnonymousFly {

	public static void main(String[] args) {
		//1. 일반적인 방법
		Flyer f1 = new FlyerImpl();
		f1.fly();
		
		//2. 익명클래스 (Anonymous 클래스)
		// => 인터페이스의 구현 클래스를 필요한 위치에서 직접 작성
		// => 인터페이스는 직접 생성(new) 될수 없고 implements 하는 클래스를 통해 생성후 사용되어짐.
		// => 단, 익명 클래스는 새로운 클래스명으로 작성하는것이 아니고, 인터페이스명(또는 조상클래스명) 으로 생성함. 
		//	  인터페이스의 구현 클래스를 new 다음에 직접 작성함
		// => 그러므로 익명 클래스는 클래스를 상속받거나, 인터페이스를 구현하는 형태만 가능하며,
		//    강제성을 부여한 일회성 코드에 주로 이용됨 (예, 이벤트 핸들러 또는 이벤트 리스너 구현)  
		// => Anonymous 클래스에서는 인터페이스이름으로 new 하고 { ... }; 블럭에서 구현
		//    마지막에는 반드시 ;
		// => 내부적으로 Flyer 를 구현한 익명의 클래스가 생성되며 이를 Anonymous 클래스 라함.	
		/*
			Flyer f2 = new class classname { ...... }
				-> 여기서 class classname 대신 조상의 이름을 사용 
					Flyer f2 = new Flyer { ...... }	
				-> 	Flyer f2 = new Flyer(); -> 인터페이스로 생성은 불가능, 오류
				->  Flyer f2 = new Flyer() {  } ; -> 익명클래스 구현, 허용 
		*/
		Flyer f2 = new Flyer() { 
			@Override
			public void fly() {
				System.out.println(" 2. 익명클래스: 오버라이딩 메서드 직접작성");
			}
			//=> 맴버추가
			//   오류는 없으나, 조상의 인스턴스로는 접근 불가능하므로 의미없음  
			void test() { System.out.println(" 맴버추가 Test"); }
		};
		//=> 사용: 작성과 동시에 생성되었으므로 호출만 하면됨
		f2.fly();
	
		//3. Object 를 상속받는 익명클래스
		Object ob = new Object() {
			@Override
			public String toString() {
				return " 3. Object 를 상속받는 익명클래스";
			}
		};
		System.out.println(ob);
		
		//=> RunTime Error Test : Error 발생시 비정상 종료
		//=> 그러므로 예외(Exception) 처리가 필요함 
		//System.out.println("Test => "+(100/0));
		
		System.out.println("** Program 정상 종료 **");
	} //main
} //class
