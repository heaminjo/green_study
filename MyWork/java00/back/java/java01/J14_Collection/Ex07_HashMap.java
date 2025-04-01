package J14_Collection;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;

import java.util.TreeMap;

public class Ex07_HashMap {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer, String>();
		Map<Integer,String> linMap = new LinkedHashMap<Integer, String>();
		
		map.put(100, "java");
		map.put(57, "Servlet");
		map.put(32, "JSP");
		map.put(83, "java");
		map.put(64,"hello");
		
		linMap.put(100, "java");
		linMap.put(57, "Servlet");
		linMap.put(32, "JSP");
		linMap.put(83, "java");
		linMap.put(64,"hello");

		Map<Integer,String> treMap = new TreeMap<Integer, String>(linMap);
		System.out.println("linked"+linMap);
		System.out.println("tree"+treMap);
		//** 해시값,  해시테이블(Hash Table), 해시함수(Hash Function), 해시알고리즘(Hash Algorithm)
		//=> 해시값
//		    - 데이터를 해시 함수로 가공한 결과
//		    - 일정한 형식의 고정된 크기의 값 (예: 128비트, 256비트)

		//=> 해시테이블(Hash Table)
//		    - 해시테이블은 키(Key)와 값(Value) 쌍을 저장하는 데이터 구조로, 
		//  데이터를 빠르게 검색, 삽입, 삭제할 수 있도록 설계된 자료구조 
//		    - 검색 속도 향상

		//=> 해시함수(Hash Function)
//		    - 입력 데이터를 고정된 크기의 고유한 출력값(해시값)을 생성하는 함수
//		    - 이 출력값은 입력값에 대해 "유일하게" 만들어지지만, 같은 입력값은 항상 같은 해시값을 생성함. 
//		    - 데이터 변환

		//=> 해시알고리즘(Hash Algorithm)
//		    - 여러 가지 해시 함수들을 구현하는 방법을 정의한 전체적인 절차나 시스템.
//		    - 즉, 해시 알고리즘은 해시 함수들을 어떻게 적용하고 처리할지를 규정하는 규칙.
//		    - 따라서 해시 함수는 알고리즘의 일부분이라 할 수 있다. 
//		    - 보안 및 데이터 무결성을 위한 다양한 해시알고리즘이 있음.
//		    - 데이터변환, 보안

		//*** 해싱  => 정석 651p
		//해싱 => 해시 함수를 이용해서 데이터를 해시 테이블에 저장하고
//		         검색하는 기법
		//------------ -----------------------------------
	}//main
}//class
