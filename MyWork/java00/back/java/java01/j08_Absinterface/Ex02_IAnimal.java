package j08_Absinterface;


interface IAnimal{
	void sound();
	void breath();
}
public class Ex02_IAnimal {
	public static void main(String[] args) {
		IAnimal cat = new ICat();
	}
}
class ICat implements IAnimal{
		@Override
		public void breath() {
			System.out.println("숨쉬기");
		}
		@Override
		public void sound() {
			System.out.println("울기");
		}
}