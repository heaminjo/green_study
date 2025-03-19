package j03_forWhile.copy;

import java.util.Random;
import java.util.Scanner;

public class Ex05_RandomGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
		//게임 진행 여부
		boolean isPlay = true;
		
		int randNum = rand.nextInt(10)+1;	
		int myNum = sc.nextInt();
		
		switch (myNum - randNum) {
		case 0: {
			System.out.println("금메달");
			isPlay = false;
			break;}
		case -1:case 1: {
			System.out.println("은메달");
			isPlay = false;
			break;}
		case -2:case 2: {
			System.out.println("동메달");
			isPlay = false;
			break;}
		default:
			System.out.println("꽝");
			break;
		}
		System.out.println("당첨 숫자:"+randNum);
		
		if(isPlay == false) {
			System.out.println("종료됩니다.");
			break;
		}
		}
	}

}
