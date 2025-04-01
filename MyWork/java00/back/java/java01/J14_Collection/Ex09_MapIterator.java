package J14_Collection;

import java.util.HashMap;
import java.util.Map;

public class Ex09_MapIterator {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer, String>();
		
		map.put(1, "AA");
		map.put(2, "BB");
		map.put(3, "DD");
		map.put(4, "FF");
		map.put(5, "EE");
		
		for(Map.Entry<Integer,String> entry: map.entrySet()) {
			System.out.printf("key : %d , value : %s \n",entry.getKey(),entry.getValue());
		}
	}

}
