package j04_array;

import java.util.Arrays;
import java.util.Random;

public class test {
	public static void main(String[] args) {
		int [] lotto = new int[6];
		Random rn = new Random();
		for (int i=0; i<lotto.length; i++) {
            int num = rn.nextInt(45)+1;
            lotto[i] = num;
            for(int j=0; j<i; j++) {
                if(lotto[i]==lotto[j]) {
                	System.out.println("중복:"+num);
                    i--;
                    break;
                }
            }
            System.out.println(Arrays.toString(lotto));
        }
	}
}
