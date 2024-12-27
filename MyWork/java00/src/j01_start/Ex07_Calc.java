package j01_start;

import java.util.Scanner;

//계산기
//두개의 정수와 연산자를 입력받아 결과 출력
public class Ex07_Calc {
    public static void main(String[] args) {
        int result = 0; //정답
        int num1,num2; //정수
        int btn = 1;
        String i; //연산자
        boolean isTrue;
        
        Scanner sc = new Scanner(System.in);

        //반복문실행
        //btn이 1(계속)일 경우 계속 실행
        while(btn == 1) {
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
            isTrue = false;
            break;
        }
        //결과 출력
        System.out.println(isTrue?"결과:"+result:
        	               "연산자를 잘못 입력했습니다.");
       
        //메뉴 출력
        System.out.println("1.계속 2.종료");
        btn = Integer.parseInt(sc.nextLine());

        //계속이 아닌 경우 메시지 출력
        if(btn != 1) {
            System.out.println("종료됩니다.");
        }
        }
        sc.close();
    }
}
