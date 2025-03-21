package j04_array;

import java.util.Arrays;
import java.util.Random;

public class Ex05_sort {
	public static void main(String[] args) {
		
		int [] lotto = new int[6];
		Random rand = new Random();
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = rand.nextInt(45)+1;
			
			for(int j=0;j<i;j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
		
		
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
		System.out.println(Arrays.toString(lotto));
		
		int []myLotto = new int[6];
		Random rand2 = new Random();
		
		for(int i=0;i<myLotto.length;i++) {
			for(int j=0;j<i;j++) {
				myLotto[i] = rand2.nextInt(45)+1;
				if(myLotto[i] == myLotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(myLotto));
		
		for(int i=0;i<myLotto.length;i++) {
			for(int j=0;j<myLotto.length;j++) {
				if(myLotto[i] < myLotto[j]) {
					temp = myLotto[i];
					myLotto[i] = myLotto[j];
					myLotto[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(myLotto));
		
		if(lotto.equals(myLotto)) {
			System.out.println("당첨!");
		}else {
			System.out.println("꽝");
		}
	}
}
