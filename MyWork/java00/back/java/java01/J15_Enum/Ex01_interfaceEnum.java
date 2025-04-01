package J15_Enum;


interface ScaleI{
	int DO = 0;
	int RE = 1;
	int MI = 3;
	int FA = 3;
	int SO = 4;
	int RA = 5;
	int SI = 6;
}

enum ScaleE{
	DO ;
}
public class Ex01_interfaceEnum {
	public static void main(String[] args) {
		int key = ScaleI.SO;
		
		switch(key) {
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		case 4:
			System.out.println("4입니다.");
			break;
		case 5:
			System.out.println("5입니다.");
			break;
		case 6:
			System.out.println("6입니다.");
			break;
		}
	}
}
