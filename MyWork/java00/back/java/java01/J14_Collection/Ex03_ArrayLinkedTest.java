package J14_Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//** ArrayList 와 LinkedList 의 효율성 비교

public class Ex03_ArrayLinkedTest {
	
	// 순차처리 add
	public static long add1(List<String> list) {
		long start = System.currentTimeMillis();
		// 현재 시스템 시간을 밀리세컨드(ms) 단위로 전달해줌
		// return 값은 long Type 
		for (int i = 0; i < 1000000; i++)
			list.add(i + "");
		long end = System.currentTimeMillis();
		return end - start;
	}
	// 비순차처리 => 중간에 넣기
	public static long add2(List<String> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++)
			list.add(500, "X");
		long end = System.currentTimeMillis();
		return end - start;
	}
	// 순차처리remove : 뒤에서부터 삭제
	public static long remove1(List<String> list) {
		long start = System.currentTimeMillis();
		for (int i = list.size()-1; i >= 0; i--)
			list.remove(i);
		long end = System.currentTimeMillis();
		return end - start;
	}
	// 중간에서 remove : 앞에서부터 삭제  
	public static long remove2(List<String> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++)
			list.remove(i);
		long end = System.currentTimeMillis();
		return end - start;
	}

	public static void main(String[] args) {
		// 추가할 데이터의 개수를 고려하여 충분히 잡아야한다.
		//ArrayList<String> al = new ArrayList<>(2000000);
		ArrayList<String> al = new ArrayList<>(100);
		LinkedList<String> ll = new LinkedList<>();

		System.out.println("= 순차적으로 추가하기 =");
		System.out.println("ArrayList :" + add1(al)); // 승
		System.out.println("LinkedList :" + add1(ll));
		System.out.println();
		System.out.println("= 중간에 추가하기 =");
		System.out.println("ArrayList :" + add2(al));
		System.out.println("LinkedList :" + add2(ll)); // 승
		System.out.println();
		
		System.out.println("= 앞에서부터 삭제하기(비순차) =");
		// => 0~10000 까지만 삭제
		System.out.println("ArrayList :" + remove2(al));
		System.out.println("LinkedList :" + remove2(ll)); //승
		System.out.println();
		
		System.out.println("= 뒤에서부터 삭제하기(순차) =");
		// => 뒤에서부터 0 까지 모두삭제
		//    그러므로 remove2를 먼저 실행해야함  
		System.out.println("ArrayList :" + remove1(al)); // 승
		System.out.println("LinkedList :" + remove1(ll));
		System.out.println("** Program Stop **");
	} //main
} //class

// ** 결과
// 1. 충분한 용량 : new ArrayList<>(2000000)
//= 순차적으로 추가하기 =
//ArrayList :70
//LinkedList :211
//
//= 중간에 추가하기 =
//ArrayList :2338
//LinkedList :9
//
//= 앞에서부터 삭제하기(비순차) =
//ArrayList :1990
//LinkedList :104
//
//= 뒤에서부터 삭제하기(순차) =
//ArrayList :7
//LinkedList :22
//** Program Stop **

//** 2. 부족한 용량 : new ArrayList<>(100)
//= 순차적으로 추가하기 =
//ArrayList :89
//LinkedList :180
//
//= 중간에 추가하기 =
//ArrayList :2300
//LinkedList :9
//
//= 앞에서부터 삭제하기(비순차) =
//ArrayList :1847
//LinkedList :103
//
//= 뒤에서부터 삭제하기(순차) =
//ArrayList :7
//LinkedList :23
//** Program Stop **