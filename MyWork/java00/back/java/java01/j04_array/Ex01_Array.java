package j04_array;

import java.util.Arrays;

public class Ex01_Array {
	static int len=10;
	public static void main(String[] args) {
		
		int sum = 0;
		int score[] = new int[len];

		score[0]= 100;
		score[1]= 90;
		score[2]= 80;
		score[3]= 70;
		score[4]= 60;
		score[5]= 50;
		score[6]= 40;
//		
//		for(int i=0;i<score.length;i++) {
//			sum += score[i];
//			System.out.printf("%d번 째 점수: %d\n",i,score[i]);
//		}
		System.out.println(score);
		System.out.println(Arrays.toString(score));
		
		for(int i : score) {
			sum+= i;
		}
		System.out.println(sum);
		
		char[] grade = {'A','B','가','나','C'};
		
		for(char ch : grade) {
			System.out.printf("%c",ch);
		}
	}//main
}//class
