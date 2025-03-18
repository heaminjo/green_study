package j01_basic;

public class Ex01_Variable01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("변수 연습 1");
		
		String name = "홍길동";
		String irum = "이순신";
		String 이름 = "내이름";
		String Name = "대문자";
		
		
		System.out.printf
		("1.변수명 적합성 : name = %s, irum=%s 이름=%s Name=%s",name,irum,이름,Name);
		byte b = 10;
		short s = 100;
		int a = 1234556789;
		long l = 123456678890L;
		
		System.out.printf("2.1) 정수형: b=%d, s=%d,i=%d,l=%d %n",b,s,a,l);
		
		
		//실수
		float f = 10.12345f;
		double d = 10.12345;
		
		f += d;
		System.out.println(f);
//		
//		boolean bol = true;
//		
//		System.out.println(bol);
//		System.out.printf("boolean: bool = %b, b<s=%b");
		
		char c = 'A';
		int num = 10;
		

		System.out.printf("%d",(int)c);
	} //main
} //class
