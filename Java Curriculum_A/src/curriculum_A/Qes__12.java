package curriculum_A;

public class Qes__12 {
	
	public static void main(String[] args) {
		
		//[概要] バイト型、単精度浮動小数点型に代入処理　→文字列型に型変換処理　→整数型に型変換処理
		//[詳細]　それぞれの型を型変換する。
			byte old = 24;  // 年齢
			float height = 168.5f; // 身長
			
		// 年齢を文字列型変換
			String old1 = String.valueOf(old); 
			System.out.println(old1);
			
		// 年齢を整数型変換
			int newOld = Integer.parseInt(old1); 
			System.out.println(newOld);
			
		// 身長を文字列型変換		
			String height1 = String.valueOf(height); 
			System.out.println(height1);
			
		// float に変換してから int にキャスト	
			float newHeight = Float.parseFloat(height1); 
			int newHeightInt = (int) newHeight;  //小数点以下切り捨て
			System.out.println(newHeightInt);
	}
}
