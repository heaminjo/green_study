package j13_Jeneric;

import j05_classMethod.Car;

//** 과제
//=> 배열을 출력해주는 제네릭 클래스 만들기
//	 배열정의, setter/getter, arrayPrint()
//=> 실행시에 원하는 타입을 결정 & 출력
//=> 배열 타입 Generic

class GenArray<T> {
	//=> private 배열
	private T[] arr;
	
	//=> setter/getter
	void setArr(T[] arr) { this.arr=arr; }
	T[] getArr() { return arr; }
	
	//=> arrayPrint()
	void arrayPrint() {
		for (T a :arr) { System.out.print(" " + a); }
		System.out.println();
	}
} //GenArray

public class Ex02_GenArray {

	public static void main(String[] args) {
		//1. String Type 배열
		String[] ss = {"짜장","파스타","쌀국수","냉면" };
		GenArray<String> ga1 = new GenArray<String>();
		ga1.setArr(ss);
		ga1.arrayPrint();
		
		//2. Character(char) Type 배열
		Character[] cc = {'도','레','미','P', 'S' };
		GenArray<Character> ga2 = new GenArray<Character>();
		ga2.setArr(cc);
		ga2.arrayPrint();
		
		//3. Integer Type 배열
		Integer[] ii = {10, 20, 30 ,40, 50};
		GenArray<Integer> ga3 = new GenArray<Integer>();
		ga3.setArr(ii);
		ga3.arrayPrint();
		
		//4. Car Type 배열
		Car[] cars = {new Car("Blue"), new Car("White"), new Car("Gold")};
		GenArray<Car> ga4 = new GenArray<Car>();
		ga4.setArr(cars);
		ga4.arrayPrint();

	} //main
} //class
