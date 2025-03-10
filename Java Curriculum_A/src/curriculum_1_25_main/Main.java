package curriculum_1_25_main;

import java.util.Scanner; //入力を受け取るためのインポート

import curriculum_1_25_setting.comment; //commentクラスを使用

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //名前の入力を受け取る
		System.out.println("名前を入力してください");
		String name = scanner.nextLine();
		
		//キャラクターを作る
		comment comment = new comment(name);
		
		//挨拶を表示
		System.out.println("こんにちは「 " + comment.getName() + " 」さん");
		
		comment.showStatus(); //ステータスを表示
		
		comment.goComment(); //冒険のメッセージ
		
		scanner.close(); //scannerを閉じる
	}
}
	
