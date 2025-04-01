package J14_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex05_SetLotto {

	public static void main(String[] args) {
		Random rand = new Random();
		Set<Integer> lotto = new TreeSet<Integer>();
		
		while(lotto.size() <= 6) {
			lotto.add(rand.nextInt(45)+1);
		}
		System.out.println(lotto.toString());
		
		List<Integer> list = new LinkedList<>(lotto);
		Collections.sort(list);
		
		System.out.println(list.toString());
	}

}
