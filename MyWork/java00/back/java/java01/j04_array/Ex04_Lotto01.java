package j04_array;

import java.util.Arrays;
import java.util.Random;

public class Ex04_Lotto01 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		int ranNum = 0;

		Random rand = new Random();
		int count = 0;
		// 중복확인
		boolean isNum = true;
		while (count < 6) {
			ranNum = rand.nextInt(45) + 1;

			for (int i = 0; i < count; i++) {
				if (lotto[i] == ranNum) {
					isNum = false;
					break;
				}
			}
			if (isNum) {
				lotto[count] = ranNum;
				count++;
			}
			isNum = true;
		}

		System.out.println("생성된 로또 번호:"+Arrays.toString(lotto));

		int max = lotto[0];
		int min = lotto[0];

		for (int i = 1; i < lotto.length; i++) {
			if (max < lotto[i]) {
				max = lotto[i];
			}
			if (min > lotto[i]) {
				min = lotto[i];
			}
		}
		System.out.println("가장 큰 값:" + max);
		System.out.println("가장 작은 값:" + min);
		
		int temp;
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto.length; j++) {
				if (lotto[i] < lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		
		System.out.println("정렬된 로또 번호:"+Arrays.toString(lotto));
		
	}

}
