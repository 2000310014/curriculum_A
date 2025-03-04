package curriculum_1_19;

public class Animal { //Animalクラス作成
	String name; //動物の名前を格納する変数
	int num;     //動物の数を格納する変数
		
	//紹介メソッド
	public void introduce() {
		System.out.printf("名前:  %-10s\n 数: %3d匹\n", name, num );
	}
}
