package J14_Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Ex06_SetUnion {

	public static void main(String[] args) {
		
		HashSet<String> set1 = new LinkedHashSet<String>();
		set1.add("red");
		set1.add("green");
		set1.add("blue");
		set1.add("pink");
		set1.add("yellow");
		
		System.out.println(set1.toString());
		
		HashSet<String> set2 = new LinkedHashSet<String>();
		set2.add("apple");
		set2.add("banana");
		set2.add("kiwi");
		set2.add("melon");
		set2.add("red");   //중복
		
		System.out.println(set2.toString());
		
		set1.addAll(set2);
		System.out.println(set1.toString());
		
		set2.retainAll(set1);
		List<String[]> li = new ArrayList<String[]>();
		System.out.println(set1);
		System.out.println(set1.contains(set2));
		
		set1.removeAll(set2);
		System.out.println(set1);
	}

}
