package curriculum_1_32_main;

import curriculum_1_32_person.Person; //Personクラスを使用

public class Main {
	public static void main(String[] args){
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		person1.print(); //person1を出力

		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		person2.print(); //person2を出力

		Person.printCount(); //カウントを表示
	}
}
