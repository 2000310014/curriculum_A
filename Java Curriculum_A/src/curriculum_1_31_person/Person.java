package curriculum_1_31_person;

public class Person {
	//インスタンスフィールドを作成
	public static int count = 0; //countを定義
	
	public String name; //名前
	public int age; //年
	public double height; //身長
	public double weight; //体重

	//コンストラクタを作成
	public Person(String name, int age, double height, double weight){
	this.name = name;
	this.age = age;
	this.height = height;
	this.weight = weight;
	count++; //人数をカウント
	}

	//インスタンスメソッド「BMI」を定義
	public double bmi(){
	return this.weight / this.height / this.height;
	}

	
	public void print(){
	System.out.println("名前は" + this.name + "です");
	System.out.println("年は" + this.age + "です");
	}
	
	public static void printCount() {
		System.out.println("合計" + count + "人です");
	}
}
