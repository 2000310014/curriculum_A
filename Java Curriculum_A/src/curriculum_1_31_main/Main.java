package curriculum_1_31_main;

import curriculum_1_31_person.Person; //Personクラスを使用

public class Main {
	public static void main(String[] args){
	Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
	person1.print(); //1人目のオブジェクトを表示

	Person person2 = new Person("山田花子", 22, 1.5, 40);
	person2.print(); //2人目のオブジェクトを表示
	
	Person.printCount(); //合計人数を表示
	}
}
