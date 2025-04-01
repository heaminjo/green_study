package j10_Exception;

//** 실수형 연산의 주의사항
//=> by Zero (나누기 0)
//	- 정수형 연산: ArithmeticException 발생
//	- 실수형 연산: Exception 이 발생하지않음 (Wrapper 클래스의 메서드를 활용)

public class Ex03_NaN {

	public static void main(String[] args) {
		try {
			//=> 실수형 나누기 0 연산
			double d1 = 1.5/0.0; //Infinity : 무한수
			double d2 = 1.5%0.0; //NaN (Not a Number) : 숫자가아님
			
			System.out.printf("** 실수형 by Zero Test: d1=%f, d2=%f, d1*100=%f \n", d1, d2, d1*100);
			//=> d1*100 도 Infinity : Exception 으로 대응할 수 없음
			//=> Wrapper 클래스의 메서드를 활용
			if ( Double.isInfinite(d1) || Double.isNaN(d2) ) {
				System.out.println("** by Zero 연산 불가능 **");
			} else {
				System.out.printf("** 실수형 by Zero Test: d1=%f, d2=%f, d1*100=%f \n", d1, d2, d1*100);
			}
			
		} catch (Exception e) {
			System.out.printf("** Exception => %s \n", e.toString());
		} finally {
			System.out.println("** finally: 무조건 실행 **");
		}
		
		System.out.println("** 프로그램 정상 종료 **");
	} //main
} //class
 