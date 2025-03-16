package curriculum_1_26_28_main;

import java.util.ArrayList; //リストを作成するためのインポート
import java.util.Scanner; //入力を受け取るためのインポート

import curriculum_1_26_28_setting.Animal; //Animalクラスを読み込む
import curriculum_1_26_28_setting.ScientificName; //ScientificNameクラスを読み込む


public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //名前の入力を受け取る
		
		System.out.println("コンソールに文字を入力してください");
		String input = scanner.nextLine();
		
		String[] animalData = input.split(","); //「 , 」で分けて動物ごとに分割する
		
		ArrayList<Animal> animals = new ArrayList<>(); //動物リストを作成
		
		for (String data : animalData) { //動物のデータを1つずつ取り出す
			String[] details = data.split(":"); //「 : 」で分けて名前・体長・速度に分ける
			if (details.length == 3) { //3つのデータ(名前・体長・速度)があるか確認
				String name = details[0];
				float height = Float.parseFloat(details[1]);
				int speed = Integer.parseInt(details[2]);
				
				animals.add(new Animal(name, height, speed)); //動物リストに追加
			}
		}
		
		for (Animal animal : animals) { //動物リストの中身を1つずつ取り出して表示する
			System.out.println("動物名 : " + animal.getName());
			System.out.println("体長 : " + animal.getHeight() + "m");
			System.out.println("速度 : " + animal.getSpeed() + "km/h");
			System.out.println("学名 : " + ScientificName.getScientificName(animal.getName()));
			System.out.println(); //改行
		}
		scanner.close(); //スキャナーを閉じる
	}
}
