package j05_classMethod;

import java.util.Scanner;

public class Ex04_OverLoading {
	
	public static int add(int a,int b) {
		return a+b;
	}
	public static double add(int a,double b) {
		return a+b;
	}
	public static double add(double a,int b) {
		return a+b;
	}
	public static double add(double a, double b) {
		return a+b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num1 = sc.nextLine();
		String num2 = sc.nextLine();
		
		if(num1.contains(".")) {
			double a = Double.parseDouble(num1); 
		}else {int a = Integer.parseInt(num1);}
		
		if(num2.contains(".")) {
			double b = Double.parseDouble(num1); 
		}else { int b = Integer.parseInt(num1);}
		
	}

}
