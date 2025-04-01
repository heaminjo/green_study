package J11_APITest;

public class Ex01_String01 {
	public static void main(String[] args) {
		String s1 = "그린";
		String s2 = "그린";
		
		String s3 = new String("그린");
		String s4 = new String("그린");
		
		//다시 리터럴 값을 넣어 변경할 경우 
		//묵시적 변환이 된다.
		
		s3 = "홍길동";
		s1 = "홍길동";
		//묵시
		if(s3 == s1)System.out.println("s1 == s1 : true");
		else System.out.println("s1 == s2 : false");
		
		System.out.printf("한글 length:%d , 영문 length:%d ",s1.length(),s3.length());
		
		int i=100 , j=123;
		
		System.out.println("문자열 연산"+s1+s3+i+j);
		System.out.println("문자열 연산 우선순위"+s1+s3+(i+j));
	}
}
