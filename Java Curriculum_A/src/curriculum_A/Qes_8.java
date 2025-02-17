package curriculum_A;

public class Qes_8 {

	public static void main(String[] args) {
		
		//[概要]　文字列型に代入処理
		//[詳細]　「鈴木一郎」を代入する。
		String name = "鈴木一郎"; //名前
		System.out.println("初めまして" + name + "です");
			
		//[概要] バイト型に代入処理
		//[詳細]　24を代入する。
		byte old = 24;  //年齢
		System.out.println("年齢は" + old + "歳です");
			
		//[概要]　単精度浮動小数点型に代入処理
		//[詳細]　168.5を代入する。
		float height = 168.5f; //身長
		System.out.println("身長は" + height + "cmです");
			
		//[概要]　単精度浮動小数点型に代入処理
		//[詳細]　64.2を代入する。
		float  weight = 64.2f; //体重
		System.out.println("体重は" + weight + "kgです");
			
		//[概要]　文字列型に代入処理
		//[詳細]　「オムライス」を代入する。
		String food = "オムライス"; //好きな食べ物
		System.out.println("好きな食べ物は" + food + "です");
		
		//[概要]　変数を入力し計算処理
		//[詳細]　BMI＝体重(kg)　÷　身長(m)の2乗　になるように代入する。小数点第一位までしか表示させない。
		System.out.println("BMIは" + String.format("%.1f", (weight / Math.pow((height / 100), 2))) + "です");
	}
	
}
