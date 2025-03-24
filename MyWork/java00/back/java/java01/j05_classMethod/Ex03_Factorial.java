package j05_classMethod;

import java.util.ArrayList;
import java.util.List;

public class Ex03_Factorial {

	public int factorial01(int n) {
		if(n==1) return 1;
		
		return n * factorial01(n-1);
	}
	
//	public static int factorial02(int n) {
//		if(n==1) return 1;
//		
//		return n * factorial01(n-1);
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex03_Factorial ex = new Ex03_Factorial();
		System.out.println(ex.factorial01(5));
		
		List<String> s= new ArrayList<String>();

	}

}
