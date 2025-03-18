package j01_start;

public class Ex03_if {

	public static void main(String[] args) {
		// ** 등급처리
		//=> score 90이상:A, 80이상:B, 70이상:C, 60이상:D, 아니면:F 를 출력 
		//=> 이상 / 이하 (포함)
		//=> 초과 / 미만 (불포함)
		
		int score=75;
		char grade='A';
		//=> 조건식 완성
		if (score>=90) grade='A';
		else if (score>=80) grade='B';
		else if (score>=70) grade='C';
		else if (score>=60) grade='D';
		else grade='F';
		System.out.printf("** 등급처리1. Score=%d, Grade=%c \n", score, grade);
		
		//=> 비교 
		if (score>=90) grade='A';
		if (score>=80) grade='B';
		if (score>=70) grade='C';
		if (score>=60) grade='D';
		else grade='F';
		System.out.printf("** 등급처리2. Score=%d, Grade=%c \n", score, grade);

	} //main

} //class
