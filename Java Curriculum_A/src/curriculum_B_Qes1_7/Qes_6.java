package curriculum_B_Qes1_7;

import java.util.Random; //ランダムな値を生成するためのクラスをインポート
import java.util.Scanner; //ユーザーが入力した値を受け取るためのクラスをインポート

public class Qes_6 {
	
	//[概要] 入力した商品の残り台数が出力されるシステム
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //scannerオブジェクトを作成
		Random rand = new Random(); //randomオブジェクトを作成
		
		System.out.print("商品名を「、」で区切って入力してください: ");
		String itemName = scanner.nextLine(); //入力を受け取る
		
		String[] items = itemName.split("、"); //「 、」で区切られた物に分ける
		
		//拡張for文で各商品を処理
		for (String item : items) { 
            int stock = rand.nextInt(12); //0~11までのランダムな数字を設定
            
            //swich文で商品ごとに処理を分岐
            switch (item) { 
            case "パソコン":
            case "冷蔵庫":
            case "扇風機":
            case "洗濯機":
            case "加湿器":
            case "テレビ":
            	System.out.println(item + "の残り台数は" + stock + "台です");
            	break;
            
            //ディスプレイが入力された場合
            case "ディスプレイ":
            	int finalStock = (item.equals("ディスプレイ")) ? (11 - stock) : stock; //ランダムで出た数字を引いて出力
            	System.out.println("ディスプレイの残り台数は" + finalStock + "台です");
            	break;
            	
            //指定した商品以外が入力された場合	
            default:
            	System.out.println("『 " + item + " 』は指定の商品ではありません" );
            } 
		}
	scanner.close(); //scannerを閉じる（リソースリーク防止）
	}
	
}
