package curriculum_1_28_29_main;

import java.util.ArrayList; //リストを作成するためのインポート
import java.util.Comparator; //オブジェクトを比較して並び替えるためのインポート
import java.util.Scanner; //入力を受け取るためのインポート

import curriculum_1_28_29_setting.Prefecture; //Prefectureクラスを読み込む

public class Main {
	public static void main(String[] args) {
		
		//都道府県リストの作成
		ArrayList<Prefecture> prefectures = new ArrayList<>();
		prefectures.add(new Prefecture("北海道","札幌市",83424));
		prefectures.add(new Prefecture("青森県","青森市",9646));
		prefectures.add(new Prefecture("岩手県","盛岡市",15275));
		prefectures.add(new Prefecture("宮城県","仙台市",7282));
		prefectures.add(new Prefecture("秋田県","秋田市",11638));
		prefectures.add(new Prefecture("山形県","山形市",9323));
		prefectures.add(new Prefecture("福島県","福島市",13784));
		prefectures.add(new Prefecture("茨城県","水戸市",6097));
		prefectures.add(new Prefecture("栃木県","宇都宮市",6408));
		prefectures.add(new Prefecture("群馬県","前橋市",6362));
		prefectures.add(new Prefecture("埼玉県","さいたま市",3798));
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Prefecture> selectedPrefectures = new ArrayList<>();
		
		//都道府県番号の入力
		while (true) {
			System.out.println("都道府県の番号をカンマ区切りで入力してください (例: 8,3,2)");
			String input = scanner.nextLine(); //入力を受け取る
			String[] numbers = input.split(","); //「,」で区切る
			boolean validInput = true; 
			selectedPrefectures.clear(); //リストをリセットする
			
			//数字を1つずつ受け取る
			for (String num : numbers) {
				try {
					int index = Integer.parseInt(num.trim()); //数値に変換
					if (index < 0 || index >= prefectures.size()) { //リストの範囲をチェック
						System.out.println(); //改行
						System.out.println("エラー: " + index + "は有効な番号ではありません。");
						validInput = false; //入力が無効な状態にする
						break; //ループを抜ける
					}
					selectedPrefectures.add(prefectures.get(index));
				} catch (NumberFormatException e) { //数字以外が入力された時
					System.out.println(); //改行
					System.out.println("エラー: 数字を入力してください。");
					validInput = false; //入力が無効な状態にする
					break; //ループを抜ける
				}
			}
			if (validInput) break; //入力が正しければループを抜ける
		}
		
		//昇順・降順の選択
		String display;
		while (true) {
			System.out.println("昇順か降順を入力してください");
			display = scanner.nextLine().trim(); //入力を受け取る
			
			if (display.equals("昇順") || display.equals("降順")) { //昇順または降順が正しく入力された場合
				break; //ループを抜ける
			} else { //されなかった場合
				System.out.println(); //改行
				System.out.println("エラー: 昇順または降順を入力してください。");
			} 
		}
		//並び替え
		if (display.equals("昇順")) { //昇順の場合
			selectedPrefectures.sort(Comparator.comparing(Prefecture::getArea));
		} else { //降順の場合
			selectedPrefectures.sort(Comparator.comparing(Prefecture::getArea).reversed());
		} 
		
		//結果の表示
		for (Prefecture p : selectedPrefectures) {
			System.out.println(); //改行
			System.out.println("都道府県名 : " + p.getName());
			System.out.println("県庁所在地 : " + p.getCapital());
			System.out.println("面積 : " + p.getArea() + "km²");
			System.out.println(); //改行
		}
		scanner.close(); //スキャナーを閉じる
	}
}
