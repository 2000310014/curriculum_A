package curriculum_1_33_main;

import curriculum_1_33_Vehicle.Bicycle; //Biccleクラスを使用
import curriculum_1_33_Vehicle.Car; //Carクラスを使用
import curriculum_1_33_person.Person; //Personクラスを使用

public class Main {
	public static void main(String[] args) {
		Person person1 = new Person("鈴木", "太郎");
		Person person2 = new Person("山田", "花子");
		
		Car car = new Car(); //Carクラスのインスタンスを作成
		Bicycle bicycle = new Bicycle(); //Bicycleクラスのインスタンスを作成
		
		car.setOwner(person1.fullName()); //Carの所有者を設定
		bicycle.setOwner(person2.fullName()); //Bicycleの所有者を設定
		
		System.out.println(car.getOwner());
		System.out.println(bicycle.getOwner());
		
		
		person1.buy(car); //インスタンスメソッドを使用し出力
		person2.buy(bicycle); //インスタンスメソッドを使用し出力
	}
}
