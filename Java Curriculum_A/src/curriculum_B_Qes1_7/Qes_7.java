package curriculum_B_Qes1_7;

import java.util.Scanner; //ユーザーが入力した値を受け取るためのクラスをインポート

public class Qes_7 {

	//[概要] N人の生徒の成績を管理するプログラムを下記条件で作成
	/*[詳細]　条件　・N人の生徒の成績を入力できるようにしてください 入力値は上から英語・数学・理科・社会の点数としてください
	　　　　　　　　 ・各生徒の科目平均点、全体の科目平均点、そして各教科の平均点を出力してください
	              ・各生徒の科目平均点、全体の科目平均点、そして各教科の平均点を出力してください
	              ・出力例を参考にプログラミングを作成してください  */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //scannerオブジェクト作成
		
		System.out.print("生徒の人数を入力してください(2以上)　: ");
		int person = scanner.nextInt(); //入力された値を取得
		
		double totalEnglish = 0, totalMath = 0, totalScience = 0, totalSocial = 0; //各科目の合計点
		double[] studentAverages = new double[person]; //各生徒の平均点を保存する配列
		
		//各生徒の点数を取得し、データを保存
		for (int i = 0; i < person; i++ ) {
			
			System.out.print((i + 1) + "人目の『英語』の点数を入力してください : ");
			int englishScore = scanner.nextInt();
			
			System.out.print((i + 1) + "人目の『数学』の点数を入力してください : ");
			int mathScore = scanner.nextInt();
			
			System.out.print((i + 1) + "人目の『理科』の点数を入力してください : ");
			int scienceScore = scanner.nextInt();
			
			System.out.print((i + 1) + "人目の『社会』の点数を入力してください : ");
			int socialScore = scanner.nextInt();
			
			//各生徒の平均点を計算して配列に保存
			studentAverages[i] = (englishScore + mathScore + scienceScore + socialScore) / 4.0;
			
			//各教科の合計を加算
			totalEnglish += englishScore;
			totalMath += mathScore;
			totalScience += scienceScore;
			totalSocial += socialScore;
			
			System.out.println(); //改行追加
		}
		//各生徒の平均点をまとめて表示
		for (int i = 0; i < person; i++) {
			System.out.printf("\n%d人目の平均点は%.2f点です。", (i + 1), studentAverages[i]);
		}
		System.out.println(); //改行追加
		
		//各教科の平均点を表示
		System.out.printf("\n英語の平均点は%.2f点です。\n", totalEnglish / person);
		System.out.printf("数学の平均点は%.2f点です。\n", totalMath / person);
		System.out.printf("理科の平均点は%.2f点です。\n", totalScience / person);
		System.out.printf("社会の平均点は%.2f点です。\n", totalSocial / person);
		
		scanner.close(); //scannerを閉じる（リソースリーク防止）
	}
}
