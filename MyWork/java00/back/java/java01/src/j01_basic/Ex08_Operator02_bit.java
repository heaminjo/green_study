package j01_basic;

import java.util.Scanner;

public class Ex08_Operator02_bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10 , y = 3;
//		String he = "hello";
		
		
        System.out.printf(Integer.toBinaryString(x^y));
        
        int password = 1234567, d = 0;
        int key = 0x1abc55;
        
        d= d^key;
        System.out.println("before Password:"+ d);
        
        boolean snow = true;
////        String result = (snow==true)? "java 공부": "또 공부";
//        result = (snow) ? "java_공부" : "그래도 Java공부";
//        
//        if(snow) result = "Java_공부";
        String day = "Red";
        
        String ss = "lloWorl";
        String str = "He11oWor1d";
//        char [] ch = str.toCharArray();
        int in = 2;
//        int end = ss.length() + in;
//        
//        for(int i= in;i<end;i++) {
//        	ch[i] = ss.charAt(i);
//        }
//        
//        for(int i = 0; i<ch.length;i++) {
//        	System.out.println(ch[i]);
//        }
        
//        String first = str.substring(0, in);
//        String end = str.substring(in+ss.length());
//        
//        System.out.println(first + ss+end);
//        System.out.println(end);
//        System.out.println(!snow && day.equals("Red")? "공원에 산책을 간다":" 집에서 요리" );
//        
//        if(!snow && day.equals("Red")) {
//        	System.out.println("공원 산책");
//        }else {
//        	System.out.println("집에서 쉬기");
//        }
        
        
        String str1 = "aaaaa";
        String str2 = "bbbbb";
        
        String result = "";
        
        for(int i = 0; i < str1.length() ;i++) {
        	result += str1.charAt(i);
        	result += str2.charAt(i);
        	System.out.println(str1.charAt(i));
        }
        String [] arr = {"a","b","c"};
        result += arr[2];
        System.out.println(arr[2]);
        System.out.println(result);
        
        String s = String.valueOf(100);
        String stra = String.valueOf(9);
        String strb = String.valueOf(91);
        
        int test1 = Integer.parseInt(stra+strb);
        
        System.out.println(test1);
        
        int ans = 20<= 50 ? 1:0;
        System.out.println(ans);
        
        String ineq = ">";
        String eq = "!";
        int answer=0;
        
        if(eq.equals("=")) {
        switch (ineq) {
        	
        	case ">": {
        		answer = 20>=50?1:0;
        		break;
        	}
        	case "<": {
        		answer = 20<=50?1:0;
        		break;
        	}
        	default:
        		break;
        	}
		}else {
			switch (ineq) {
        	
        	case ">": {
        		answer = 20>50?1:0;
        		break;
        	}
        	case "<": {
        		answer = 20<50?1:0;
        		break;
        	}
        	default:
        		break;
			}
		}
        System.out.println(answer);
        
        boolean aa= true;
        aa = !aa;
        System.out.println(aa);
       
	}

}
