package curriculum_B_Qes1_7;

import java.util.Random;
import java.util.Scanner;

public class Qes_1_3 {
	
	public static void main(String[] args) {
		
		//　Qes1
		
		//[概要] scannerを使用した、ログイン時の入力チェックシステム作成
		/*[詳細]　条件　ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力
		              ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力
		              ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力 */
		
		Scanner scanner = new Scanner(System.in); //scannerオブジェクト作成
		String name = ""; //ユーザーの名前を保存する変数を用意
		
		while (true) { //無限ループ（正しい入力があるまで繰り返す）
			System.out.print("「名前を入力してください」 ");
			name =scanner.nextLine(); //ユーザーが入力した文字を取得
		
			//10文字以上のとき、エラーメッセージを出して再入力
			if (name.length() > 10) {
				System.out.println("「名前を10文字以内にしてください」");
				
			//何も入力されなかったとき、エラーメッセージを出して再入力	
			} else if (name.length() == 0 || name == null) {
				System.out.println("「名前を入力してください」");
				
			//正しく入力された場合ループを抜ける	
			} else {
				break;
			}
		}
		//正しく入力された場合の処理
		System.out.println("ユーザー名「" + name + "」を登録しました");
		
		
		
		//　Qes2
		
		//[概要] scannerを使用した、ログイン時の入力チェックシステム作成
		//[詳細]　条件　ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力

		String name2 = ""; //ユーザーの名前を保存する変数を用意
		
		while (true) { //無限ループ（正しい入力があるまで繰り返す）
			System.out.print("「半角英数字のみで名前を入力してください」");
			name2 = scanner.nextLine(); //ユーザーが入力した文字を取得
			
			//何も入力されなかったとき、エラーメッセージを出して再入力
			if (name2.length() == 0) {
				System.out.println("「名前を入力してください」");
			
			//10文字以上のとき、エラーメッセージを出して再入力
			} else if (name2.length() > 10) {
				System.out.println("「名前を10文字以内にしてください」");	
				
			//半角英数字以外が入力された場合、エラーメッセージを出して再入力
			} else if (!name2.matches("^[a-zA-Z0-9]+$")) {
				System.out.println("「半角英数字のみで名前を入力してください」");	
				
			//正しく入力された場合ループを抜ける
			} else {
				break;
			}
		}
		//正しく入力された場合の処理
		System.out.println("ユーザー名「" + name2 + "」を登録しました");
		
		
		//　Qes3
		
		//[概要] じゃんけんシステムの作成
		/*[詳細] 条件　「0はグー、1：チョキ、2：パー」とすること
					   じゃんけんに勝つまでループすること
					   一回ごとに自分の手と相手の手を下記の通り出力
					   じゃんけんを行った回数を表示してください */
		
		int gameCount = 0; //じゃんけんをカウントする
		
		while (true) {
			gameCount++; //1回ごとに足していく
			
			System.out.print(name2 + "の手を入力してください（0: グー, 1: チョキ, 2: パー）: ");
			int userHand = scanner.nextInt(); //ユーザーが入力した手を取得
			scanner.nextLine(); //改行を消すため
			
			Random rand = new Random();
			int computerHand = rand.nextInt(3); //コンピュータの手をランダムに決定
			
			//それぞれの手を表示
			System.out.println(name2 + "の手は" + handToString(userHand));
			System.out.println( "相手の手は" + handToString(computerHand));
			
			//あいこの場合
			if (userHand == computerHand) {
				System.out.println("DRAW あいこ もう一回しましょう！");
			
			//ユーザーがチョキで負けた場合
			} else if (userHand == 1 && computerHand == 0) {
				System.out.println("俺の勝ち！");
				System.out.println("負けは次につながるチャンスです！");
				System.out.println("ネバーギブアップ！");
			
			//ユーザーがパーで負けた場合
			} else if (userHand == 2 && computerHand == 1) {
				System.out.println("俺の勝ち！");
				System.out.println("たかがじゃんけん、そう思ってないですか？");
				System.out.println("それやったら次も、俺が勝ちますよ");
			}
			
			//ユーザーがグーで負けた場合
			else if (userHand == 0 && computerHand == 2) {
				System.out.println("俺の勝ち！");
				System.out.println("なんで負けたか、明日まで考えといてください。");
				System.out.println("そしたら何かが見えてくるはずです");
			}
			
			//ユーザーが勝った場合
			else if ((userHand == 0 && computerHand == 1) || (userHand == 1 && computerHand == 2) || (userHand == 2 && computerHand == 0)) {
				System.out.println("やるやん");
				System.out.println("次は俺にリベンジさせて");
				break;
			}
		}	
		//じゃんけんの合計回数
		System.out.println("勝つまでにかかった合計回数は" + gameCount + "回です");
		
		scanner.close(); //scannerを閉じる（リソースリーク防止）
	}
	//手を文字列に変換するメソッド（0: グー, 1: チョキ, 2: パー）
	public static String handToString(int hand) {
		if (hand == 0) return "グー";
		if (hand == 1) return "チョキ";
		return "パー";	
	}
}
	
