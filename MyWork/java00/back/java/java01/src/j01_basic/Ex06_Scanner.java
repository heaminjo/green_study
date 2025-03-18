package j01_basic;

import java.util.Scanner;

public class Ex06_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("이름 입력:");
		String name = sc.nextLine();
		
		System.out.printf("나이 입력:");
		int age = sc.nextInt();
		
		sc.nextLine();
		System.out.printf("주소 입력:");
		String addr = sc.nextLine();
		System.out.println("이름:"+name+ "\n나이:"+age);
	}
}
