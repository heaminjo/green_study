package j03_forWhile.copy;

public class Ex05_conBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=7;j++) {
				if(i == 4 && j ==4) {
					continue;
				}
				System.out.printf("[%d,%d]",i,j);
			}
			System.out.println();
		}
	}

}
