package j01_basic;

import java.util.Scanner;

public class Ex03_switchBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean isLogin;
		
		System.out.println("로그인 하시겠습니까? (Y/N)");
		String select = sc.nextLine();
		
		isLogin = select.equals("Y") ? true:false;
		
		System.out.println(isLogin);
		System.out.println("메뉴를 선택해주세요.");
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("3. 게시판");
		System.out.println("4. 게임하기");
		System.out.println("5. 고객센터");
		int menu = sc.nextInt();
		
		
		switch (menu) {
		case 1: {
			System.out.println("로그인");
		break;
		}
		case 2: {
			System.out.println("회원가입");
			break;
			}
		case 3: {
			System.out.println("게시판");
			break;
			}
		case 4: {
			System.out.println("게임하기");
			if(isLogin) {
				System.out.println("원하는 게임을 선택하세요");
				System.out.println("즐거운 시간 되세요");
			}else {
				System.out.println("로그인 먼저 하세요");
			}
			break;
			}
		case 5: {
			System.out.println("고객센터");
			break;
			}
		default:
			System.out.println("메뉴 선택 오류");
		}
		
		System.out.println("직업 코드:");
		
		
		//숙제
		//교재 103p 예제 4-4 , 105p 예제 4-5
		//교재 125p 연습문제 4-1
		
		
		int x = 15;
		char ch = 'f';
		int year = 4;
		String str = "sa";
		boolean powerOn = true;
		
		System.out.println(x > 10 && x < 20 ? true:false);
		System.out.println(ch != ' ' && ch!='\t' ? true:false );
		System.out.println(ch == 'x' || ch == 'X'? true:false);
		System.out.println(ch - '0' >= 0 && ch - '0' <= 9? true: false);
		System.out.println(Character.isUpperCase(ch)? true:false);
		System.out.println((year % 400 == 0 || year % 4 == 0) && year % 100 != 0?true:false);
		System.out.println(!powerOn?true:false);
		System.out.println(str.equals("yes") ? true:false);
	}

}
