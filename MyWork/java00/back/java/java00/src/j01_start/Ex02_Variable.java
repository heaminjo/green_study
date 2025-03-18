package j01_start;
// ** 변수 와 상수 (Ch2)

//* 변수(Variable) 정의
//=> type, 변수명, value
//=> type 은 불변, value 는 변경가능

//* 상수(Constant)
//=> type, 변수명, value
//=> type 불변, value도 불변
//=> 주로 고정값 에 사용 (PI = 3.141592)
//=> 전체 대문자로 표기 (컴파일오류는 없지만 묵시적규칙)
//=============================================
//** 기본자료형
//=> 예약어로 정의된 Type
//=> 더이상 나누어질수 없는 기본 자료형

//=> 논리형 : boolean(참_true / 거짓_false, 1byte)
//=> 문자형 : char(2byte)
//=> 정수형 : byte(8_1), short(16_2), int(32_4byte), long(64_8byte)
//=> 실수형 : float(4byte), double(8byte)

//** 참조자료형
//=> String 
//=> 모든 클래스는 참조자료형이 될 수 있음
//=============================================

//** 용어정리
//=> identifier: 직접작명하는 식별자 (프로젝트, 패키지, 클래스, 메서드, 변수, 상수 등의 이름)
//=> modifier: 특징을 제한하는 한정자 (public, static..등 예약어의 일종) 
//=> 리터럴(literal): 변수 우측의 값(Value)

//** identifier 작명의 일반적 규칙  
//=> class 명은 대문자로 시작.
//=> 상수명은 전체대문자로 작성. 
//=> 위외는 모두 소문자로 시작. ( 합성: setName_카멜표기 ) 
//=> 한글: 허용은 되지만 권장하지 않음
//=> 연산자(+,-,*,/,%, @, =) 는 식별자에 포함할 수 없음
//=> 한번 선언된 변수명은 재선언 할수 없음 
//( 동일한 identifier 를 중복 선언할 수 없음 )

//=============================================
//** Java 특징
//1. 운영체제 독립적.
//2. 객체지향 언어.
//3. 비교적 배우기 쉽다.
//4. 자동메모리 관리(가비지콜렉션, Garbage Collection)
//5. 네트워크 분산처리 지원
//6. 멀티쓰레드(Multi_Thread) 지원 
//7. 동적로딩(Dynamic Loading) 지원

//** Java 실행구조
//=> 소스코드저장_~.java -> 자바컴파일러(javac.exe)_~.class   
//                     -> 자바인터프리터(자바실행기, java.exe)
//	 C:\MTest\MyWork\java00\src\j01_start> javac Ex00_Hello.java
//   -> 오류가 없으면 (예제 Ex00_Hello.java 에는 한글과 package 가 없어야함)
//   C:\MTest\MyWork\java00\src\j01_start> java Ex00_Hello
//	 -> 결과출력

//=> 프로그램실행명령 -> 클래스 로딩 -> 클래스내의 main 메서드를 실행 

public class Ex02_Variable {

	public static void main(String[] args) {
		// 1. 변수 정의
		String name="홍길동"; 
		String 이름 = "김길동";
		name = "이순신";
		char grade = 'C'; 
		// int name="abc"; -> 자바는 재선언 절대 불허함
		
		// 2. 상수 정의
		//final String country = "Korea"; -> 바람직하지않음
		final String COUNTRY="Korea"; 
		//COUNTRY = "대한민국";
		double PI = 3.141592 ;
		final int AGE = 22;
		
		grade = 'A';
		//grade = '상+';
		name = "상+++";
		
		System.out.println("** 변수와 상수 정의 **");
		System.out.print("* COUNTRY="+COUNTRY);
		System.out.println();
		System.out.print("* name="+name+"\n"); // "\" 는 escape 문자
		System.out.print("* 이름="+이름+"\n");
		System.out.print("* grade="+grade+"등급%n"); //
		System.out.print("* PI=\\n"+PI+"\t\t"); 
		//=> "\\" 는 "\" 를 출력하라는 의미
		//=> "\t" 는 tab 간격 뛰어쓰기, "\t\t" 는 tab 간격 2회 
		System.out.print("* AGE="+AGE);
		// 3. Type 종류
		// 3.1) 정수형
		// => byte, short, int, long
		byte bb = 10;
		short ss = 100;
		int ii = 1234567890;
		long ll = 12345678901234L; 
		//=> Java 에서 정수 값은 기본적으로 int 로 취급
		//   그로므로 long Type 표시를 위해 l 또는 L 을 붙임 
		System.out.printf("\n* 정수 => bb=%d, ss=%d, ii=%d, ll=%d\n",bb,ss,ii,ll);
		System.out.printf("* 출력연습 => name=%s, COUNTRY=%s, grade=%s, PI=%f %n",name,COUNTRY,grade,PI);
		//=> "%" 기호는 printf 에서만 가능함 즉, print 또는 println 에서 "%n" 은 그냥출력됨
		
		// 3.2) 실수형
		//=> float(4), double(8)
		//=> Java 에서 실수 리터럴(literal) 의 기본Type 은 double
		double dd=123.456789;
		//float ff=123.456; // ff (4byte) <- 123.4 (double_8byte) 
		float ff=123.456789f;
		//=> f/F 모두 가능
		System.out.printf("* 실수 => dd=%10.3f, ff=%f %n", dd, ff);
		
		// 3.3) boolean 
		//=> true(1) / false(0)
		//=> True(X) / False(X)
		//=> 모든 관계식의 결과는 boolean Type
		boolean bool=true;
		System.out.printf("* Boolean => bool=%b, bb>ss=%b, bb==ss=%b %n", bool, bb>ss, bb==ss);
		
		// 4) 대입 과 동등비교 그리고 치환
		//=> "=" : 대입연산자 (좌측변수에 우측의 값을 전달함)
		//=> "==" : 동등비교연산자 (좌측과 우측의 값이 동일한지를 확인하는 관계연산자) 
		//=> 치환 : A 와 B 의 값을 서로 맞바꿈 하는것
		//         예) cup1 콜라, cup2 사이다 이들을 맞교환 하는것
		//				-> 이를 위해서는 cup 이 하나더 필요함 (변수도 동일함)
		String c1 = "콜라" ;
		String c2 = "사이다" ;
		String temp=c1; // 임시변수를 사용함
		c1=c2;
		c2=temp;
		System.out.printf("** 치환(맞교환) => c1=%s, c2=%s %n", c1, c2);
		
		// ** 비교
		//=> 리터럴 은 대부분의 코드에서 정해져있지않고 변수로 전달되기 때문에
		//   아래처럼 사용하지 않고 위의 코드처럼 치환해야함
		c1="사이다" ;
		c2="콜라" ;
		
		//5) 오버플로우(Overflow) / 언더플로우(Underflow) 
		//5.1) 정수형
		//=> short 기준: 0000 0000 0000 0000 / 1111 1111 1111 1111
		short sMax = Short.MAX_VALUE;
		short sMin = Short.MIN_VALUE;
		System.out.printf("** s_오버플로우1 : sMax=%d, sMax+1=%d \n", sMax, (sMax+1));
		//=> Java 의 int Type 이하 정수형의 연산결과는 모두 int 
		//=> 연산결과를 short Type 으로 얻으려면 형변환이 필요함.
		System.out.printf("** s_오버플로우2 : sMax=%d, sMax+1=%d \n", sMax, (short)(sMax+1));
		System.out.printf("** s_언더플로우1 : sMin=%d, sMin-1=%d \n", sMin, (sMin-1));
		System.out.printf("** s_언더플로우2 : sMin=%d, sMin-1=%d \n", sMin, (short)(sMin-1));
		 
		int iMax = Integer.MAX_VALUE;
		int iMin = Integer.MIN_VALUE;
		System.out.printf("** i_오버플로우 : iMax=%d, iMax+1=%d \n", iMax, (iMax+1));
		System.out.printf("** i_언더플로우 : iMin=%d, iMin-1=%d \n", iMin, (iMin-1));
		
		//5.2) 실수형
		//=> 가장 가까운 값을 표현함
		//=> by Zero Test (/, % 연산 모두 정수형은 컴파일오류 발생)
		//=> 컴파일 오류는 일어나지 않음
		float f = 1234.5678f ;
		System.out.printf(" float by Zero Test1 : f/0=%f \n", (f/0));  //Infinity
		//System.out.printf(" int by Zero 비교 : iMax/0=%d \n", (iMax/0)); -> 컴파일오류
		
		//=> Infinity (무한수)
		//=> NaN (Not a Number) -> 특수값 
		//=> 연산자 "%" : 나머지 값을 구해줌 -> 7%3=1 , 6%2=0
		System.out.println(" float by Zero Test2 : f%0="+ (f%0)); //NaN		
		
		//System.out.println(" Infinity + NaN Test => "+ Infinity + NaN); 
		//=> Infinity, NaN : 실수형에서 결과로만 표현될 수 있음, 연산적용 불가
		System.out.println(" Infinity + NaN Test1 => "+ ((f/0)+(f%0))); //NaN
		System.out.printf(" Infinity + NaN Test2 => %f \n", ((f/0)+(f%0))); //NaN
		
		//=> Float: float 형을 지원하는 라이브러리 
		
		//** 제어문 (순차처리에서 흐름을 변경)
		//=> 조건문, 반복문
		
		// 6) 조건문
		//=> 조건에 따라 실행흐름을 변경할수 있도록해줌
		//=> 구문형식 : if (조건식) ~~;
		//=> 블럭 : 복합문은 {  } 블럭으로 감싼다
		//=> 종류
		//	-> if
		//	-> if_else
		//	-> if_else if
		//	-> 중첩 if : if 문 내부에 if 문을 포함하는 형식  
		
		float f2=f/0;
		if ( Float.isInfinite(f2)==true ) {
			// => 복합문은 {  } 블럭으로 감싼다
			System.out.println("** Error : f2 는 Infinity 입니다 ");
			System.out.println("** Error : f2 는 계산할 수 없는 값 입니다.");
		}else 
			System.out.println("** 년간 합계 => "+(f2*12));
		
		// **비교
		// => 위의 구문과 결과는 동일하지만 효율성에서 차이가 남
		if ( Float.isInfinite(f2)==true ) {
			// => 복합문은 {  } 블럭으로 감싼다
			System.out.println("** Error : f2 는 Infinity 입니다 ");
			System.out.println("** Error : f2 는 계산할 수 없는 값 입니다.");
		}
		if ( Float.isInfinite(f2)==false )
			System.out.println("** 년간 합계 => "+(f2*12));
		
		f2=f%0;
		if ( Float.isNaN(f2)==true ) System.out.println(" f2 는 NaN 입니다 ");
		
		// ** if else if
		f2=1000f;
		if (Float.isInfinite(f2)==true) {
			System.out.println("** Error : f2 는 Infinity 입니다 ");
			System.out.println("** Error : f2 는 계산할 수 없는 값 입니다.");
		}else if ( Float.isNaN(f2)==true )
			System.out.println(" f2 는 NaN 입니다 ");
		else if ( f2>1000 ) 
			System.out.println(" f2 의 값 1000을 초과하면 계산할 수 없습니다. ");
		else System.out.println("** 년간 합계 => "+(f2*12));
		
		// ** 중첩 if 
		if (Float.isInfinite(f2)==true) {
			System.out.println("** Error : f2 는 Infinity 입니다 ");
			System.out.println("** Error : f2 는 계산할 수 없는 값 입니다.");
		}else {
			if ( Float.isNaN(f2)==true )
				System.out.println(" f2 는 NaN 입니다 ");
			else if ( f2>1000 ) 
				System.out.println(" f2 의 값 1000을 초과하면 계산할 수 없습니다. ");
			else System.out.println("** 년간 합계 => "+(f2*iMax));
		} //if_isInfinite
		
	} //main

} //class
