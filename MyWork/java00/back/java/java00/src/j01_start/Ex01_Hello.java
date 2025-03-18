package j01_start;

// 한줄주석
/* 
 	여러줄 주석
 	~ ~ ~ ~ ~
 */
// 프로젝트 -> 패키지 -> 클래스 (대문자로 시작) -> 메서드 (기능구현)

//** 클래스 
//=> 클래스명은 화일명과 동일함.
//=> 맴버   
//	 변수 선언문: value 를 가지는 variable(가변적인, 변수_명사), 
//	 메서드 (함수 function , 프로시져 procedure) : 동작

//** 문장(Statement)
//=> 사용자가 컴퓨터에게 작업을 지시하는 단위
//=> 문장의 끝은 항상 세미콜론 (;)
//=> 선언문 과 실행문(메소드 안에 작성) 

//** Java Coding
//=> 대.소 문자구별함
//	- name 과 Name 은 다름
//	- String 과 string 은 다름 

public class Ex01_Hello {
	//=> 선언문 은 가능
	String name = "엄미현";  
	String job = "강사";
	int age=22;
	char gender = '여'; //알파벳, 한글 모두 한글자
	
	//name="99";
	//System.out.println("안녕하세요 강사 엄미현 입니다 ~~");
	//=> 실행문: Java 규칙위배
	
	public static void main(String[] args) {
		System.out.println("** 콘솔 출력 Test **");
		System.out.println("안녕하세요 강사 엄미현 입니다 ~~");
		System.out.println("이름 : 엄미현");
		System.out.println("직업 : 강사");
		System.out.println("나이 : 22");
		System.out.println("성별 : F");
		
		// ** 변수 활용하기 **
		String name = "엄미현";
		String job = "안녕하세요 ~~12월26일";
		int age=22;
		char gender = '여'; //알바벳, 한글 모두 한글자
		
		name="신맴버들";
		gender='M';
		age=99;
		System.out.println("이름 : "+name);
		System.out.println("직업 : "+job);
		System.out.println("나이 : "+age);
		System.out.println("성별 : "+gender);
		
	} //main
	
} //class
