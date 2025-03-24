package j05_classMethod;


class Phone{
	String company;
	int price;
	static int count ;
	
	public Phone () {};
	
	public Phone (String company,int price) {
		this.company = company;
		this.price = price;
	}
	public int dataUp(int i) {
		return 1* 100;
	}

	@Override
	public String toString() {
		return "Phone [company=" + company + ", price=" + price + "]";
	}
	
}
public class Ex05_Consructor {

	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.company= "삼성 갤럭시";
		p1.price = 10000;
		
		Phone p2 = new Phone("hello",30);
		
		System.out.println(p2);
	}
}
