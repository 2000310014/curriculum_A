package curriculum_1_32_person;

public class Person {
	
	//インスタンスフィールドを作成
	public static int count = 0;  //人数をカウントする
	public String firstName; //苗字
	public String lastName; //名前
	public int age; //年
	public double height, weight; //身長、体重

	//コンストラクタを作成
	public Person(String firstName, String lastName, int age, double height, double weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		Person.count++; //人数をカウント
	}

	//フルネームを取得
	public String fullName() {
		return this.firstName + this.lastName;
	}

	//「print」インスタンスメソッドを作成
	public void print() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}

	//「bmi」インスタンスメソッドを作成
	public double bmi() {
		return this.weight / this.height / this.height;
	}

	//「printCount」インスタンスメソッドを作成
	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}
}
