package j10_Exception;

public class Ex04_throw {

	public static void main(String[] args) {
		
		try {
			double d1 = 1.5/0.0; //Infinity : 무한수
			double d2 = 1.5%0.0; //NaN (Not a Number) : 숫자가아님
			
			if ( Double.isInfinite(d1) || Double.isNaN(d2) ) {
				//=> Exception 을 강제적으로 발생 -> catch 블럭으로
				throw new Exception("실수형 by Zero 오류");
			} else {
				System.out.printf("** 실수형 by Zero Test: d1=%f, d2=%f, d1*100=%f \n", d1, d2, d1*100);
			}
			
		} catch (Exception e) {
			System.out.printf("** Exception => %s \n", e.toString());
		} finally {
			System.out.println("** finally: 무조건 실행 **");
		}
		
		System.out.println("** 프로그램 정상 종료 **");
	}//main
} //class
