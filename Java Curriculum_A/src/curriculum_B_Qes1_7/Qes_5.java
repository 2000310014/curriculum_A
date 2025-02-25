package curriculum_B_Qes1_7;

public class Qes_5 {

	//[概要] for文を使用し 1×1 ~ 20×9 を作成
	//[詳細] for文の2重ループを使用し 1×1 ~ 20×9 までの表を作った
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 9; i++) { // i　は 1 ~ 9（掛ける数のループ）
			for (int j = 1; j <= 20; j++) { // i　は 1 ~ 20（段のループ）
				System.out.print(String.format("%03d * %03d = %03d" + " || ", j , i , j * i )); //1桁の数字を3桁に変換
			}
			System.out.println(); //各段が終わったら改行
		}
	}
}
