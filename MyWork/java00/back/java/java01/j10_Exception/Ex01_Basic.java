package j10_Exception;

public class Ex01_Basic {

	public static void main(String[] args) {
		//1. 변수정의
		int x=6, y=3, result=0;
		String s="123000"; // "가나다라"
		String[] menu = {"짜장", "짬뽕", "비빔밥", "된장찌게"};
		
		//2. 실습
		//2.1) Exception(예외) 처리 하기전
		//=> 예외발생(RunTime Error) 시 비정상 종료 (java.lang.ArithmeticException: / by zero)
		//System.out.printf("2.1) (예외)처리 하기전 result=%d \n", (x/result));
		
		//2.2) Exception(예외) 처리 하기
		try {
			result=x/y; //x/0 -> ArithmeticException: / by zero
			result=Integer.parseInt(s); //-> java.lang.NumberFormatException
			
			//menu[4]="탕수육"; //-> java.lang.ArrayIndexOutOfBoundsException
			//menu = new String[-5];
			//-> 배열크기 음수지정: java.lang.NegativeArraySizeException 
			result=menu.length; //배열의 길이
			
			//s=null; // 전/후 비교 -> java.lang.NullPointerException
			result=s.length();  //String의 길이(메서드) 
			System.out.printf("2.2) (예외)처리 적용 result=%d \n", result);
			
		} catch(ArithmeticException e) {
			System.out.printf("** ArithmeticException => %s \n", e.toString());
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.printf("** 인데스 범위를 벗어남. => %s \n", e.toString());		
		} catch(NumberFormatException e) {
			System.out.printf("** 숫자가 아닙니다. => %s \n", e.toString());	
		} catch(NullPointerException e) {
			System.out.printf("** null 값에 접근 => %s \n", e.toString());	
		} catch (Exception e) {
			//=> Exception에 다형성이 적용 ( Exception e = new 후손() )
			//	그러므로 Exception 의 모든 후손객체들이 catch 블럭으로 전달됨
			//  그러므로 각 Exception 별로 처리하는것도 가능
			//  이때는 조상인 Exception객체는 제일 마지막에 정의해야함 (순서중요, 컴파일오류)  
			
			//=> Exception Message Test 
			System.out.printf("** Exception, e.getMessage => %s \n", e.getMessage());
			System.out.printf("** Exception, e.toString => %s \n", e.toString());
			System.out.printf("** Exception, e.printStackTrace => \n");
			e.printStackTrace();
			// => e.toString 을 포함한 순차적인 실행경로 등이 출력되어
			//    예외발생의 원인과 경로 파악에 도움. 
		} finally {
			System.out.println("** finally: 무조건 실행 **");
		}

		System.out.println("** 프로그램 정상 종료 **");
	} //main
} //class
