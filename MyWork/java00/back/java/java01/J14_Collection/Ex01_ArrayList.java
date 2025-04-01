package J14_Collection;

import java.util.ArrayList;
import java.util.List;

import j05_classMethod.Car;

public class Ex01_ArrayList {

	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
		ArrayList list1 = new ArrayList();
		list1.add("홍길동");
		list1.add(123.456);
		list1.add(new Car("pink"));

		System.out.println(list1.toString());
		System.out.println(list1.size());
		
		list1.ensureCapacity(20);
		
		System.out.println(list1.get(1));
		
		double d = (double)list1.get(1);
		
		list1.set(1, 20);
		System.out.println(list1.toString());
		
		list1.add(100);
		list1.add(2,200);
		System.out.println(list1.toString());
		
		List<Car> list3 = new ArrayList<Car>();
		
		list3.add(new Car("red"));
		list3.add(new Car("blue"));
		list3.add(new Car("green"));
		
		for(Car c : list3) {
			System.out.println(c.color);
		}
	}

}
