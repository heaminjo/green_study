package j07_extends;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {

	public static void main(String[] args) {
		String myString = "aaxxbbxx";

		

        String [] list = myString.split(" ");
        Arrays.sort(list);
        System.out.println(list);
        for(String i : list) {
        	System.out.println(i.length());
        }
        
        String[] answer = myString.split("x");
        System.out.println(answer[]);
	}

}
