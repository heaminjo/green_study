package J14_Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

class Student {
	private String no;
	private String name;
	private int score;
	
	//기본 생성자
	public Student() {}

	public Student(String no, String name, int score) {
		super();
		this.no = no;
		this.name = name;
		this.score = score;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", score=" + score + "]";
	};
	
	
	
	
	
}
public class Ex09_MapStudent {

	public static void main(String[] args) {
		Map<String,Student> sMap = new HashMap<String, Student>();
		
		sMap.put("001", new Student("1","홍길동",100));
		sMap.put("002", new Student("2","김영희",80));
		sMap.put("003", new Student("3","고길동",40));
		sMap.put("004", new Student("4","이유리",80));
		sMap.put("005", new Student("5","김철수",50));
		
		
		//수정
		sMap.get("003").setName("이순신");
		sMap.get("5").setScore(5);
		
		//삭제
		sMap.remove("2");
		sMap.remove("001");
		System.out.println(sMap);

		
		}
	}


