package j01_start;

import java.util.Scanner;

//** 종합 연습
//=> ver01: 두개의 정수 와 산술연산자를 입력받아 결과 출력하기
//=> ver02: Upgrade, 반복문 적용하기 
//          - 메뉴 추가 :  1. 계속, 2. 종료 
//			- 연산자를 잘못 입력한 경우 : 메시지 출력후 계속하기 

public class Ex07_Calc {

	public static void main(String[] args) {
		// 1. DATA 입력 받을 준비
		// => Scanner 생성
		Scanner sc = new Scanner(System.in);
		
		// 2. DATA 입력 받기
		System.out.println("** 숫자1 을 입력하세요 =>");	
		int num1 = Integer.parseInt(sc.nextLine());  
		System.out.println("** 숫자2 를 입력하세요 =>");	
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println("** 연산자를 입력하세요 =>");
		String operator = sc.nextLine();
		sc.close(); //Scanner 사용을 마치면 close
		
		// 3. 연산하기
		int result = 0;
		switch(operator) {
		case "+" : result=num1+num2; break;
		case "-" : result=num1-num2; break;
		case "*" : result=num1*num2; break;
		case "/" : result=num1/num2; break;
		case "%" : result=num1%num2; break;
		default : System.out.println("** 연산자를 잘못 입력했습니다. **");
				// => 오류 발생시에는 결과 출력없이 종료하려면 ~~~
				  return; //현재 메서드 종료	
		} //switch
		
		// 4. 출력하기
		System.out.printf("** 결과 : %d %s %d = %d \n", num1, operator, num2, result);
		
	} //main
} //class
