package curriculum_A;

public class Qes_9 {

	public static void main(String[] args) {
		
		//[概要]　文字列型に代入処理
		//[詳細]　「鈴木一郎」を代入する。
		String name = "鈴木一郎"; //名前
		System.out.println("初めまして" + name + "です");
			
		//[概要] バイト型に代入処理
		//[詳細]　24を代入する。24を追加代入し和算する。
		byte old = 24; //年齢
		byte old2 = 24; //年齢
		System.out.println("年齢は" + (old + old2)+ "歳です");
			
		//[概要]　単精度浮動小数点型に代入処理
		//[詳細]　168.5を代入する。168.5を追加代入する。1つの変数に和算し、まとめる。
		float height = 168.5f; //身長
		float height2 = 168.5f; //身長
		float totalheight = height + height2;
		System.out.println("身長は" + totalheight + "cmです");
			
		//[概要]　単精度浮動小数点型に代入処理
		//[詳細]　64.2を代入する。64.2を追加代入する。1つの変数に和算し、まとめる。
		float  weight = 64.2f; //体重
		float weight2 = 64.2f; //体重
		float totalweight = weight + weight2;
		System.out.println("体重は" + totalweight + "kgです");
			
		//[概要]　文字列型に代入処理
		//[詳細]　「オムライス」を代入する。
		String food = "オムライス"; //好きな食べ物
		System.out.println("好きな食べ物は" + food + "です");
		
		//[概要]　変数を入力し計算処理
		//[詳細]　BMI＝体重(kg)　÷　身長(m)の2乗　になるように代入する。小数点第二位までしか表示させない。
		System.out.println("BMIは" + String.format("%.2f", (totalweight / Math.pow((totalheight / 100), 2))) + "です");
	}
}
