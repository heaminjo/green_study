package J14_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex02_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new LinkedList<>();
		
//		String [] menu = {"비빔","밥","카레","라이스"};
//		list = Arrays.asList(menu);
		
		System.out.println(list.toString());
		list.add("apple");
		list.add("banana");
		list.add("kiwi");
//		System.out.println(list.toString());
//		list.remove(2);
//		System.out.println(list.toString());
		
//		list = new ArrayList<String>(list);		
//		System.out.println(list.toString());
		
		Iterator<String> itMenu = list.iterator();
		
		while(itMenu.hasNext()) {
			System.out.println(itMenu.next());
		}
	}

}
