package j01_start;

import java.util.Scanner;

// do-while문 사용해서 만들어봤습니다

// SQLD (SQL 개발자) -> 누구나 응시 가능

public class Ex07_Result03Park {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int num1, num2; //입력하는 수
        String operator;
        String next;

        do {
            System.out.println("첫번째 숫자, 부호, 두번째 숫자 순으로 입력하시오.");
            num1 = sc.nextInt();
            operator = sc.next();
            num2 = sc.nextInt();

            switch(operator) {
            case "+": 
                System.out.println("결과=" + (num1+num2));
                break;
            case "-": 
                System.out.println("결과=" + (num1-num2));
                break;	
            case "*": 
                System.out.println("결과=" + (num1*num2));
                break;
            case "/": 
                System.out.println("결과=" + (num1/num2));
                break;
            default: 
                System.out.println("잘못된 값입니다.");
            } //switch
            
            System.out.println("더 입력하실 거면 y를 입력하세요.");
            next = sc.next();
            
        }while(next.equals("y")); 
        // => next 의 값이 "y" 이면 계속 (아니면 종료)
        //    ( next == "y" -> String_참조자료형 의 값은 "==" 으로 비교할수 없고,
        //		equals 메서드를 사용함  )
        
        sc.close();
    }//main
} //class
