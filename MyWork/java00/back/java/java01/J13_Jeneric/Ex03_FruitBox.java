package J13_Jeneric;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import J13_Jeneric.FruitBox.Fruiti;
import j05_classMethod.Car;

class Fruit{
	public String toString() {
		return"";
	}
}

class Apple extends Fruit implements Fruiti{
	@Override
	public String toString() {
		return  "저는 사과 입니다.";
	}
}
class Banana extends Fruit implements Fruiti{
	@Override
	public String toString() {
		return  "저는 바나나 입니다.";
	}
}
class kiwi extends Fruit implements Fruiti{
	@Override
	public String toString() {
		return  "저는 키위 입니다.";
	}
}
class Tomato{
	public String toString() {
		return  "저는 토마토 입니다.";
	}
}

 class FruitBox<T extends Fruit>{
	 private List<T> fruitBox = new ArrayList<T>();

	public List<T> getFruitBox() {
		return fruitBox;
	}

	public void setFruitBox(T [] fruitBox) {
		for(T t : fruitBox) {
			this.fruitBox.add(t);
		}
	}
	 
	public void arrayPrint() {
		for(Fruit f : fruitBox) {
			System.out.println(f.toString());
		}
	}
	
	 class FruitBoxi<T extends Fruiti>{
		 private List<T> fruitBox = new ArrayList<T>();

		public List<T> getFruitBox() {
			return fruitBox;
		}

		public void setFruitBox(T [] fruitBox) {
			for(T t : fruitBox) {
				this.fruitBox.add(t);
			}
		}
	 Collection<String> list = new ArrayList<String>;
 }
 
 interface Fruiti{
	 
 }
public class Ex03_FruitBox {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox= new FruitBox();
		
		Fruit [] fruitList = {new Apple(),new Banana(),new kiwi(),new kiwi()}; 
//		fruitBox.setFruitBox(fruitList);
		
		Apple [] apple = {new Apple(),new Apple(),new Apple()};
		Banana [] banana= {new Banana(),new Banana(),new Banana()};

		fruitBox.setFruitBox(apple);
		fruitBox.setFruitBox(banana);
		fruitBox.arrayPrint();	
		
		//인터페이스
		FruitBoxi<Fruiti> fruitBoxi= new FruitBoxi<>();

		Fruiti[] fi = {new Apple(),new Banana(),new kiwi()};
		
		
	}	
	
}
