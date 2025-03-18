package j01_start;

//** 연산자(Operator)
//=> 특정 연산을 나타내는 기호
//=> 연산자들의 우선순위가 있음
//=> 피연산자(Operand) : 연산의 대상

public class Ex06_Operator {

	public static void main(String[] args) {
		//** 사칙연산
		int a=10, b=3; //선언문 (선언과 동시에 초기화)
		System.out.println("** 사칙연산 **");
		System.out.println("a + b = "+(a+b));
		System.out.println("a - b = "+(a-b));
		System.out.println("a * b = "+(a*b));
		System.out.println("a / b = "+(a/b));
		System.out.println("a % b = "+(a%b));
		//** 대입연산
		//=> a+b 의 결과를 a 에 넣으세요~
		//   a = a+b 이를 간편하게표기 : a += b
		System.out.println("** 대입연산 **");
		System.out.println("a += b : "+(a+=b)); // 10+3, a=13
		System.out.println("a -= b : "+(a-=b)); // 13-3, a=10
		System.out.println("a *= b : "+(a*=b)); // 10*3, a=30
		System.out.println("a /= b : "+(a/=b)); // 30/3, a=10
		System.out.println("a %= b : "+(a%=b)); // 10%3, a=1
		//** 단항연산
		//=> 1씩 증.감 (전 or 후)
		a=10; b=10; //각각 값을 할당하는 실행문
		System.out.println("** 단항연산 **");
		System.out.println("++a : "+(++a)); //1 증가후 11 출력 (a=11)
		System.out.println("b++ : "+(b++)); //10 출력후 1 증가 (b=11) 
		System.out.println("--a : "+(--a)); //1 감소후 10 출력 (a=10)
		System.out.println("b-- : "+(b--)); //11 출력후 1 감소 (b=10)
		//** 관계연산
		//=> 모든 관계연산의 결과는 boolean (참_true / 거짓_false)
		a=10; b=3;  
		System.out.println("** 관계연산 **");
		System.out.println("a==b : "+(a==b)); //false
		System.out.println("a!=b : "+(a!=b)); //true
		System.out.println("a>b : "+(a>b));   //true
		System.out.println("a>=b : "+(a>=b)); //true
		System.out.println("a<b : "+(a<b));   //false
		System.out.println("a<=b : "+(a<=b)); //flase
		
		//** 삼항식
		//=> (조건_관계식) ? 참 : 거짓
		//=> a, b 중 큰수 출력하기
		b=100;
		int max = (a>b) ? a : b ; 
		System.out.printf("* 삼항식1 : max=%d \n", max);
		
		//=> a, b 두수의 차이를 출력하기
		max = (a>b) ? (a-b) : (b-a) ;
		System.out.printf("* 삼항식2 : 차이값=%d \n", max);
		
		//=> 삼항식에는 모든 기본 자료형 적용 가능
		char c1 = (a>b) ? 'T' : 'F' ;
		char c2 = (a>b) ? '참' : '부' ;
		String s = (a>b) ? "참" : "거짓" ;
		boolean bool = (a>b) ? true : false ;
		System.out.printf("* c1=%s, c2=%s, s=%s, bool=%b \n", c1, c2, s, bool);
		
		//** 논리(집합) 연산
		//=> && , || , !
		
		// 1) a, b 모두 짝수이면 true
		// -> ( a 는 짝수) 동시에_&& (b 는 짝수)
		a=10; b=7;
		bool = (a%2==0) && (b%2==0) ;
		System.out.printf("*논리(집합) 연산1: bool=%b \n", bool);
		
		// 2) a, b 둘중 하나만 짝수이면 true
		bool = (a%2==0) || (b%2==0) ;
		System.out.printf("*논리(집합) 연산2: bool=%b \n", bool);
		
		// 3) 부정, Not
		System.out.printf("*논리(집합) 연산3: !bool=%b \n", !bool);

	} //main

} //class
