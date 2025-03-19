package j03_forWhile.copy;

public class Ex03_MultiLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result =0;
		
//		for(int i=1; i<=200;i++) {
//			if(i % 10 == 0) {
//				result += 0.2;
//			}
//		}
//		
//		System.out.printf("감량: %.2fkg",result);
//		int count =1;
//		while (count<=100) {
//			if(count % 3 ==0) {
//				result += count;
//			}
//			count++;
//		}
		
		for(int i=1;i<=100;i++){
			if(i % 3 ==0) {
				result += i;
			}
		}
		System.out.println(result);
		
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=10;j++) {
				System.out.printf("[%d,%d]",i,j);
			}
			System.out.println();
		}
	}

}
