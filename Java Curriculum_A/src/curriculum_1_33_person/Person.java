package curriculum_1_33_person;

import curriculum_1_33_Vehicle.Bicycle; //bicycleクラスを使用
import curriculum_1_33_Vehicle.Car; //carクラスを使用

public class Person {
	
	//インスタンスフィールドを作成
	public String firstName;
	public String lastName;

	//コンストラクタを作成
	public Person(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}

	//フルネームを取得
	public String fullName(){
		return this.firstName + this.lastName;
	}
	
	//「car」インスタンスメソッドを定義
	public void buy(Car car) {
		car.setOwner(this.fullName());
		System.out.println(car.getOwner() + "が購入しました");
	}
	
	//「bicycle」インスタンスメソッドを定義
	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName());
		System.out.println(bicycle.getOwner() + "が購入しました");
	}
}
