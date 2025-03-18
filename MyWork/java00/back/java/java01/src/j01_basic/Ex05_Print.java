package j01_basic;

import java.util.Date;

public class Ex05_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		System.out.println("\t\"Korea\"");
		System.out.printf("반지름이 %d인 원의 넓이는 %10.2f 입니다.",10,10*10*Math.PI);
		
		Date now = new Date();
		double num = 10;
		System.out.printf("%d",(int)num);
		System.out.printf("%tY년 %tm월 %td일 입니다. \n",now,now,now);
		
		
	}

}
