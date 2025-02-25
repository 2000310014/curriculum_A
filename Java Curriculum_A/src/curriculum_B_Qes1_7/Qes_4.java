package curriculum_B_Qes1_7;

public class Qes_4 {
	
	//[概要] for文を使用し九九を作成
	//[詳細]　for文の2重ループを使用し1×1~9×9までの表を作った
	
	public static void main(String[] args) {
	
		for (int i = 1; i <= 9; i++) { // i　は 1 ~ 9（段のループ）
			for (int j = 1; j <= 9; j++) { // j　は 1 ~ 9（掛ける数のループ）
				System.out.print(String.format("%02d * %02d = %02d" + " || ", i,j,i * j)); //1桁の数字を2桁に変換
			}
			System.out.println();	//各段が終わったら改行
		}
	}
}
