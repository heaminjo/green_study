package J14_Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Ex04_HashSet {
	public static void main(String[] args) {
		Object [] ob = {"123",123};

//		Object [] ob = {"가나다","Green","123",123,new Integer(300),"Green",123.45};
		HashSet<Object> hs = new HashSet<>();
		
		System.out.println(hs.toString());
		
		for(Object o : ob) {
			hs.add(o);
		}
		
		System.out.println(hs);
		
		
		Iterator<Object> iSet = hs.iterator();

//		for(iSet.hasNext()) {
//			System.out.println(iSet.Next());
//		}
		
		
		Set<String> list = new HashSet<String>();
		
		list.add("apple");
		list.add("banana");
		list.add("kiwi");
		list.add("orange");
		list.add("melon");
		
		Iterator<String> iSet2 = list.iterator();
		
		while(iSet2.hasNext()) {
			if(iSet2.next().contains("a")) {
				iSet2.remove();
			}
		}
		System.out.println(list);
		
		for(String i : list) {
			System.out.println(i);
		}
	}
}
