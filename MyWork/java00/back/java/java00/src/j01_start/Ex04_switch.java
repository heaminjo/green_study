package j01_start;

import java.util.Scanner;

//** switch - case - break 문
//1. => switch(key) 문 인자의 Type은 int, char, String 만 가능
//2. => break : 무조건 탈출 (없으면 아래로 계속 default 까지 진행)
//3. => case 블럭에 구문이 없어도 됨 (아래 구문으로 진행됨)
//4. => case 블럭에는 복합구문에도 {....} 사용하지 않음 
//5. => case 값으로 변수 사용은 불가 그러나 변수를 사용하지 않은 수식은 허용

//** if ~ else if 와 비교 
//=> switch 가 더 효율적 ( direct 분기하므로 )

public class Ex04_switch {
	
	public static void main(String[] args) {
		// ** Data 입력받기
		//=> Scanner 활용
		// 1) Scanner 생성
		Scanner sc = new Scanner(System.in);
				
		// 2) 입력받고 처리
		System.out.println("** 이름을 입력하세요 =>");	
		String name= sc.nextLine();
		
		System.out.println("** 점수를 입력하세요 =>");	
		int score=Integer.parseInt(sc.nextLine());
		
		char grade='A';
		
		// ** switch - case - break 문 
		switch(score) {
		case 90: grade='A';  
		case 80: grade='B';  
		case 70: grade='C'; 
				 break;
		case 60: grade='D';  
		default: grade='F';	
		} //switch
		System.out.printf("** 등급처리 Name=%s, Score=%d, Grade=%c \n", name, score, grade);
		
		String result="";
		switch(grade) {
		case 'A': result="최우수"; break;
		case 'B': result="우수"; break;
		case 'C': result="미"; break;
		case 'D': result="양"; break;
		default : result="가"; 
		}
		System.out.printf("** Result : result=%s \n", result);
		
		result="Test"; //default Test
		switch(result) {
		case "최우수": System.out.println("** 장학금 수여 !!! **"); break;
		case "우수": System.out.println("** 참잘했습니다 !!! **"); break;
		case "미": System.out.println("** 조금만 더 노력 하세요 !!! **"); break;
		case "양": System.out.println("** 조금많이 노력 하세요 !!! **"); break;
		default : System.out.println("** 아주많이 노력 하세요 !!! **");  
		}
		
		/* 실수적용 => 컴파일 오류
		double d=12.345;
		switch(d) {
		case 12.3 : break;
		}
		*/
		sc.close();
	} //main

} //class
