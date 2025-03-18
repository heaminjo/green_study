package j01_start;

import java.util.Scanner;

public class Ex07_Result02 {

	public static void main(String[] args) {
		
        int result = 0; //정답
        int num1,num2; //정수
        //int btn = 1;
        String i; //연산자
        boolean isTrue;

        Scanner sc = new Scanner(System.in);

        //반복문실행
        //=> 조건값 true 면 계속 실행
        //=> 반복문 종료 시켜주는 명령문 : break
        while(true) {
        	
        	isTrue = true;
	        System.out.print("정수1 입력:");
	        num1 = Integer.parseInt(sc.nextLine());
	        System.out.print("정수2 입력:");
	        num2 = Integer.parseInt(sc.nextLine());
	
	        System.out.print("연산자 입력:");
	        i = sc.nextLine();
	
	        switch (i) {
	        case "+": {
	            result = num1 + num2;
	            break;
	        }
	        case "-": {
	            result = num1 - num2;
	            break;
	        }
	        case "*": {
	            result = num1 * num2;
	            break;
	        }
	        case "/": {
	            result = num1 / num2;
	            break;
	        }
	        case "%": {
	            result = num1 % num2;
	            break;
	        }
	        default:
	            System.out.println("연산자를 정확히 입력해주세요");
	            isTrue = false;
	        }
	        //결과 출력
	        System.out.println(isTrue ? "결과:"+result : "연산자를 잘못 입력했습니다.");
	
	        //메뉴 출력
	        System.out.println("** 메뉴 선택: 1.계속 2.종료");
	
	        //계속이 아닌 경우 메시지 출력
	        if ( Integer.parseInt(sc.nextLine()) != 1 ) {
	            System.out.println("종료됩니다.");
	            break;
	        }
        } //while
        sc.close();
    }//main

} //class
