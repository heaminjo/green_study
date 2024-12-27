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
		System.out.printf("* 삼항식 : max=%d \n", max);
		
		char c = (a>b) ? 'T':'F';
		System.out.println(c);
		String s = (a>b)? "a가 더 크다" : "b가 더 크다";
		
		System.out.println(s);
		
		//1) 둘다 짝수
		boolean isTrue = a % 2 == 0 && b % 2 == 0 ? true: false;
		System.out.println(isTrue);
		
		isTrue = a % 2 == 0 || b % 2 == 0 ? true: false;
		System.out.println(isTrue);
		//3)부정
		System.out.println(!isTrue);
	} //main

} //class
