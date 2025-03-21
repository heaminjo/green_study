package j04_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Ex99_Shuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//=> 길이가 10인 배열 정의 하고, 0~9 로 초기화
		//=> random 을 이용해서 배열의 임의의 위치에 있는 배열의 값과
//		     배열의 첫번째(0) 값과 교환하는일을 100번 반복해서 배열을 
//		     뒤섞이도록 한후, 출력하기.
		
//		int [] arr = {0,1,2,3,4,5,6,7,8,9};
//		
//		Random rand = new Random();
//		int num ;
//		int temp;
//		for(int i=0;i<100;i++) {
//			num = rand.nextInt(9);
//			temp = arr[0];
//			arr[0] = arr[num];
//			arr[num] = temp;
//		}
//		
//		System.out.println(Arrays.toString(arr));
//		
		
//		String my_string = "banana";
//		String is_prefix = "bwan";
//		
//		int result = 0;
//		for(int i=0;i<my_string.length();i++) {
//			
//			if(my_string.substring(0,i+1).equals(is_prefix)) {
//				result =1;
//			}
//		}
//		System.out.println(result);
//		
		
//		String my_string = "Progra21Sremm3";
//		int s = 6;
//		int e = 12;
//		
//		String start = my_string.substring(0,s);
//		String end = my_string.substring(e+1);
//		StringBuilder newStr = new StringBuilder();
//		newStr.append(my_string.substring(s,e+1));
//		
//		newStr.reverse();
//		String answer = start + newStr + end;
		
//		String my_string = "ihrhbakrfpndopljhygc";
//		int m = 4;
//		int c = 2;
//		
//		List<String> arr = new ArrayList<String>();
//		String answer ="";
//		
//		for(int i=0;i<my_string.length();i+= m) {
//			arr.add(my_string.substring(i,i+m));
//		}
//		
//		System.out.println(arr.toString());
//		for(int i=0;i<arr.size();i++) {
//
//			answer += arr.get(i).charAt(c-1);
//		}
//		System.out.println(answer);
//		String my_string = "Programmers";
//		int [] answer = new int[52];
//		//모든 인덱스에 0 넣기
//		Arrays.fill(answer,0);
//		
//		for(int i=0; i<my_string.length();i++) {
//			//만약 대문자라면 
//			if(Character.isUpperCase(my_string.charAt(i))) {
//				answer[my_string.charAt(i) - 65]++;
//			}
//			else {
//				answer[my_string.charAt(i)-71]++;
//			}
//		}
//		System.out.println(Arrays.toString(answer));
		String answer ="";
		String my_string = "apporoograpemmemprs";
		char [] arr = my_string.toCharArray();
		int [] indices = {1, 16, 6, 15, 0, 10, 11, 3};
		for(int i=0;i<indices.length;i++) {
			arr[indices[i]] = '*';
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != '*') {
				answer += arr[i];
			}
		}
		System.out.println(answer);
	}

}