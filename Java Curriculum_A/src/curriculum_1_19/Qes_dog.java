package curriculum_1_19;

	//Qes_1.2
	//[概要] フィールドに動物の名前と数の変数を定義
	class Animal2 {
		String  name; //動物の名前を格納するフィールド
		int num;      //動物の数を格納するフィールド
		
	//Qes_4	
	//[概要]	コンストラクタで動物の名前と数を初期化
		public Animal2(String na, int nu) {
		name = na; //引数で渡された名前をフィールドに代入
		num = nu;  //引数で渡された数をフィールドに代入
	}
		//紹介メソッド
		void introduce() {
			System.out.printf("名前:  %-10s\n 数: %3d匹\n", name, num );
		}
	}

	public class Qes_dog {
		public static void main(String[] args) {
	
	//Qes_3
	//[概要] インスタンスを作成し、名前と数を渡してコントラクタを呼び出す
			Animal2 dog = new Animal2("ポチ", 3);
			dog.introduce(); //紹介
		}
	}
