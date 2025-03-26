package j07_extends;

import j05_classMethod.Car;

public class Student {
	private String no;
	private String name;
	private int score;
	
	Car car = new Car();
	static Car mycar = new Car();
	
	//기본 생성자
	public Student() {
		super();
	}
	
	//초기화 생성자
	public Student(String no, String name, int score) {
		super();
		this.no = no;
		this.name = name;
		this.score = score;
	}
	
	//getter/setter
	public String getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}

	//toString
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", score=" + score + "]";
	}
	
}
