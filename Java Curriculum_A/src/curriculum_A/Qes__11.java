package curriculum_A;

public class Qes__11 {

	public static void main(String[] args) {
		
		//[概要] バイト型、単精度浮動小数点型に代入処理　→文字列型に型変換処理
		//[詳細]　それぞれの型を型変換する。繋げて出力する。
			byte old = 24;  //年齢
			float height = 168.5f; //身長
			float  weight = 64.2f; //体重
			
			String old1 = String.valueOf(old); //年齢を文字列型変換
			String height1 = String.valueOf(height); //身長を文字列型変換
			String weight1 = String.valueOf(weight); //体重を文字列型変換
			
			System.out.println( old1 + "・" + height1 + "・" + weight1 );
	}
}
