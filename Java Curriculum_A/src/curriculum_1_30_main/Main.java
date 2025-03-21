package curriculum_1_30_main;

import curriculum_1_30_person.Person; //Personクラスを使用

public class Main {
	public static void main(String[] args) {
		//入力したいオブジェクトを作成
	    Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
	   
	    System.out.println(person1.name);
	    System.out.println(person1.age);
	    System.out.println(person1.height);
	    System.out.println(); //改行
	    
	    person1.print(); //名前、年、BMIを表示
	    
	    Person.printTotalCount(); //合計人数を表示
	 }
}
