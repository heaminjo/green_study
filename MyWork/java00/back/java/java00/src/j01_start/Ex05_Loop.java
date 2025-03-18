package j01_start;

//** 반복문
//=> 반복문의 3요소: 반복자의 초기값, 조건식(true/false), 증감식
//=> for: for (초기값; 조건식; 증감식) { ..실행문.. }
//=> while, do while
//	- 초기값: before Loop 
//	- 조건식: while(조건식) 
//	- 증감식: in Loop

//=> 반복자(iterator)
//	: 반복문에서 횟수를 count 하는 변수 

public class Ex05_Loop {

	public static void main(String[] args) {
		//** 과제
		//=> 1~100 까지의 합을 구하세요
		//=> 1+2+3+.......+100
		//   int result = 1+2+3+.......+100;
		int result=0;
		// 1. for
		//int i=1;
		for (int i=1; i<=100; i++) {
			result=result+i; 
			// start: result = 0+1(i) -> 1
			//        result = 1+2(i) -> 3
			//	      result = 1+2+3(i) -> 6
			//System.out.println("** for내부 i, result => "+i+", "+result);
		} //for
		System.out.println("** for Result => "+result);
		//System.out.println("** for i => "+i); //21
		
		// 2. while
		result=0;
		int i=1; //반복자 초기화
		while (i<=100) {
			result=result+i; 
			i++;
			System.out.println("** while 내부 i, result => "+i+", "+result);
		}//while
		System.out.println("** while Result => "+result);
		
		/* ** 무한 Loop
		//=> 멈추지않고 무한반복 하는 반복문 
		while (true) {
			i++;
			System.out.println("** while 무한_Loop i => "+i);
		}//while
		*/
		// 3. do_while
		//=> 조건이 거짓이어도 최소한 1회는 실행함
		result=0;
		i=101; //반복자 초기화
		do {
			result=result+i; 
			i++;
			System.out.println("** do_while 내부 i, result => "+i+", "+result);
		}while(i<=100);
		System.out.println("** do_while Result => "+result);
		
		// 4. 배열과 반복문
		//=> 배열: 동일한 성격의 동일한 Type 의 자료를 하나의 묶음으로 처리
		//=> 배열의 장점: index(0부터 ~) 를 통해서 접근, 반복문 사용가능
		//=> 과제: 5명의 학생 성적처리를 한다고 가정
		
		//4.1) 배열적용전
		int s1=100, s2=90, s3=80, s4=70, s5=60; 
		int sum=s1+s2+s3+s4+s5;
		
		//4.2) 배열적용
		//int score[] = new int[5]; 
		int score[] = {99, 87, 55, 64, 70, 75, 94};
		System.out.printf("** 배열크기 :  score.length=%d \n", score.length);
		
		score[0] = 100;
		sum=0;
		for (int ii=0; ii<score.length; ii++) {
			sum=sum+score[ii];
			System.out.printf("** 점수:  index=%d, score=%d \n",ii ,score[ii]);
		}//for
		
		System.out.printf("**반통계:  합계=%d, 평균=%f \n",sum ,(double)(sum/score.length));
		
	} //main

} //class
