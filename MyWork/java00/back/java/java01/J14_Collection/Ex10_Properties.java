package J14_Collection;

import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;

public class Ex10_Properties {
	public static void main(String[] args) {
		
		Properties pp = new Properties();
		
		pp.setProperty("list","list11");
		pp.setProperty("detail","d");
		pp.setProperty("join","dd");
		pp.setProperty("login","ds");
		
		
		Enumeration<?> epp = pp.propertyNames();
		while(epp.hasMoreElements()) {
			String eKey = (String)epp.nextElement();
			System.out.println(epp.nextElement());
		}
		
//		for(Entry<Object, Object> entry: pp.entrySet()) {
//			System.out.println(entry.getKey());
//		}
	}
}
