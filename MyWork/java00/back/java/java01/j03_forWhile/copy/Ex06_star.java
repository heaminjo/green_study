package j03_forWhile.copy;

public class Ex06_star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		for(int i=0;i<9;i++) {
			for(int j = 9; j>0;j--) {
				if(j<=i) {
					System.out.print('*');
				}else {
					System.out.print(' ');
				}	
			}
			for(int k=0;k<=i;k++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
