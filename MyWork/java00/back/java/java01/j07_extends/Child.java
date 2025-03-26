package j07_extends;

import java.util.Arrays;
import java.util.Collection;

public class Child extends Ex03_Father {
	
	String name;
	int money;
	
	
	public Child() {
		super();
	}
	
	//조상멤버만 초기화
	public Child(String name, int money) {
		super(name,money);

	}
	
	//현재 클래스만 초기화
	//인자 순서를 다르게 하여 오버로딩
	public Child(int money,String name) {
		this.money=money;
		this.name = name;
	}
	public Child(String fname,int fmoney,String name,int money) {
		super(fname,fmoney);
		this.money=money;
		this.name = name;
	}
	
	public void info() {
		System.out.printf("FName=%s, CName=%s, money=%d \n",Ex03_Father.name,this.name,this.money);
	}
	
	@Override
	public void bank(int money) {
		System.out.println("Child back 메서드");
		this.money += money /2;
		System.out.println("입금한 돈:"+money);
		super.bank(money/2);
		System.out.printf("아빠돈: %d\n 내 돈: %d",super.getMoney(),this.money);
	}
	
//	@Override
//	public void test() {
//		
//	}
	
	public static void main(String[] args) {
		Child Tom = new Child("TTOOMM",10000,"Tom",100);
		Child Jerry = new Child(1000,"Jerry");
		Child Jerry2 = new Child("Jerry",1000);
		Tom.info();
		Jerry.info();
		
		Tom.bank(2000);
		Jerry.bank(2000);
		Jerry2.bank(3000);
		Tom.test();
		
		
	}
}
