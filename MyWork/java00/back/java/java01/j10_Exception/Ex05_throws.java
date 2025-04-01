package j10_Exception;

import java.io.IOException;

//** Checked Exception
//=> 예외처리 의무 : 안하면 컴파일오류
//=> IOException

//** UnChecked Exception
//=> 예외처리 의무 없음
//=> RunTimeException 의 후손 객체들
//=> throws 가능 : 상위메서드에서도 예외처리는 의무가 아님 

//** Exception 처리
//=> 직접 처리 : 해당 메서드 내에서 try ~ catch 블럭 처리 
//=> 위임 처리  
//	- 상위 메서드로 Exception 처리를 위임(떠넘기기)
//	- throws Exception


public class Ex05_throws {
	
	//1) 직접 처리
	public static String readString1() {
		byte[] bf = new byte[100];
		System.out.println("** 문자열을 입력 하세요~ => ");
		
		//System.in.read(bf);
		//=> Checked Exception
		//	- 예외처리를 하지않으면 컴파일오류 발생
		//	- Unhandled exception type IOException
		try {
			System.in.read(bf);
		} catch (IOException e) {
			//=> Exception 대체가능, RunTimeException 대체불가능(Error)
			System.out.println("** IOException => "+e.toString());
		}
		return new String(bf);
	} //readString1
	
	//2) 위임(떠넘기기)
	//=> throws IOException
	//   IOException의 처리를 상위의 메서드(현재메서드를 call 한 메서드) 로 떠넘김
	//=> throws 하는 Exception 은 모두 Checked 방식으로 처리 해야함
	//=> throws 하는 Exception 을 처리하는 구문에서는 Exception 적용범위가 더 넓어야함 
	//   즉, throws Exception -> main 의 catch (IOException e) : 오류
	public static String readString2() throws IOException {
		byte[] bf = new byte[100];
		System.out.println("** 떠넘기기Test, 문자열을 입력 하세요~ => ");
		System.in.read(bf);
		return new String(bf);
	} //readString2	
	
	//3) UnChecked Exception 떠넘기기
	public static void intByZero() throws ArithmeticException {
		int i=10/0; 
	}
	
	public static void main(String[] args) throws IOException {
		//1) 직접 처리
		System.out.println("** main, readString1 => "+readString1());
		
		/*2) 위임(떠넘기기)
		//=> Exception 처리를 하지않으면 Unhandled exception ~~~ 컴파일오류
		try {
			System.out.println("** main, readString2 => "+readString2());
		} catch (IOException e) {
			System.out.println("** main IOException => "+e.toString());
		}
		*/
		//3) main 도 throws 가능
		System.out.println("** main, readString2 => "+readString2());
		
		//4) UnChecked Exception 떠넘기기
		//=> 예외처리가 없어도 컴파일오류 없음
		intByZero();

	} //main
} //class
