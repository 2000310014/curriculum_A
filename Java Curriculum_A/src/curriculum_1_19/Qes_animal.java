package curriculum_1_19;

import java.time.LocalDateTime; //時間を取得するインポート
import java.time.format.DateTimeFormatter; //表示形式を決めるインポート
	
	public class Qes_animal {
		public static void main(String[] args) {
	
	//Qes_1.2
	//[概要] 動物の名前と数をコンソールに出力
			//dogオブジェクトを作成
			Animal dog = new Animal();
			dog.name = "ポチ"; //名前
			dog.num = 3; //数
			dog.introduce(); //紹介
			
			
	//Qes_3
	//[概要] 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力
			//今の時間をコンピュータからもらう
			LocalDateTime now = LocalDateTime.now();
			//もらった時間を指定の形にする
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
			//変換する
			String formattedDateTime = now.format(formatter);
			//画面に表示する
			System.out.println("現在の時刻: " + formattedDateTime);
		}
	}
