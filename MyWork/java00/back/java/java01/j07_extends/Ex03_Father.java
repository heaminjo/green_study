package j07_extends;

import static j07_extends.Animal.legs;

public class Ex03_Father {
	
	static int legs = 100;
	
	static String name;
	private int money;
	static final String COUNTRY = "Korea";
	
	
	
	public Ex03_Father() {System.out.println("father Default 생성자");}


	public Ex03_Father(String name,int money) {
		Ex03_Father.name = name;
		this.money = money;

		System.out.println("Father 기본 생성자");
	}
	
	public void setMoney(int money) {
		this.money += money;
	}


	public int getMoney() {
		return money;
	}


	//돈을 합산
	public void bank(int money) {
		System.out.println("아빠 입금 전:"+this.money);
		this.money += money;
		System.out.printf("아빠 입금 후:%d, 입금한 돈:%d",this.money,money);
	}
	
	
	public static void test() {
		System.out.println("부모 test");
	}
	public static void main(String[] args) {
		Ex03_Father fa = new Ex03_Father("조해민",10000);
		String name ="dsds";

		System.out.println(name.charAt(2));
		fa.bank(10000);
		fa.bank(-5000);
		System.out.println(legs);
	}

}
