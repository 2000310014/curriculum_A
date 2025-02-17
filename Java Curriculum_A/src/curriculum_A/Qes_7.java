package curriculum_A;

public class Qes_7 {

	public static void main(String[] args) {
	
	//[概要]　単精度浮動小数点型に代入処理
	//[詳細]　170.5を代入する。
		float height = 170.5f; //身長
		
	//[概要]　単精度浮動小数点型に代入処理
	//[詳細]　62.2を代入する。
		float  weight = 62.2f; //体重
		
	//[概要]　変数を入力し計算処理
	//[詳細]　BMI＝体重(kg)　÷　身長(m)の2乗　になるように代入する。
		System.out.println("BMIは" + (weight / Math.pow((height / 100),2) ) + "です");
	}
}