package j04_array;

import java.util.Arrays;

public class Ex02_ArrayType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char [] ch = {'A','B','C','D','E'};
		String [] str = {"aa","bb","cc","dd","ee"};
		float [] fl = {1.2f,2.3f,4.5f,3.4f,3.5f};
		long [] ll = {100,200,300,400,500};
		
		for(char c:ch) {
			System.out.printf("%c ",c);
		}
		System.out.println();
		for(String s: str) {
			System.out.printf("%s ",s);
		}
		System.out.println();
		for(float f:fl) {
			System.out.printf("%.1f ",f);
		}
		System.out.println();
		for(long l:ll) {
			System.out.printf("%dl ",l);
		}
	}

}
