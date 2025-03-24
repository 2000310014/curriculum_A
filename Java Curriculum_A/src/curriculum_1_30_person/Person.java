package curriculum_1_30_person;

public class Person { //Personクラスを作成
	//インスタンスフィールドを定義
	public static int count = 0; //作成された人数をカウントする
	
	public String name; //名前
	public int age; //年齢
	public double height; //身長
	public double weight; //体重
	
	//コンストラクタを作成
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++; //人数をカウント
	}
	
	//インスタンスメソッド「BMI」を定義
	public double bmi() {
		return Math.floor(this.weight / (this.height * this.height)) + 0.0;  //BMIの計算式 小数点は全て切り捨て
	}
	
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.printf("BMIは %.1f です\n", this.bmi()); //小数第一位まで表示
		System.out.println(); //改行
	}
	
	public static void printTotalCount() {
		System.out.println("合計" + count + "人です");
	}
}
