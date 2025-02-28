package curriculum_New_1_18;

import java.util.Random;
import java.util.Scanner;

public class Qes_1_7 {

	
	//Qes_1  メソッド name を定義（引数: 文字列 greet、　整数 num）
	public static void name(String greet, int num) {
		System.out.println("「" + greet + num + "」");
	}
		
	//Qes_2  メソッド　totalNum を定義
	public static void totalNum(long num) {
		System.out.println(num + "の乗算は " + (num * num) + " です");
	}
		
	//Qes_3 配列を受け取り、要素を順番に出力するメソッド
	public static void printArray(int[] numbers) {
		for (int num : numbers) { //拡張for文で配列の要素を順に取り出す
			System.out.println(num);
		}
	}
	
	//Qes_4 Q2をオーバーロードして引数を小数2つに変更
	public static void totalNum(double Num1, double Num2) {
		System.out.println(Num1 + " と " + Num2 + " の和算は " + (Num1 + Num2) + " です");
	}
	
	//Qes_5 メソッド　generateRandomNumbers を定義
	public static int[]  generateRandomNumbers(int count) {
		Random rand = new Random(); //randomオブジェクト作成
		int[] randomNumbers = new int[count]; //指定された回数分の配列を用意
		
		for (int i = 0; i < count; i++) {
			randomNumbers[i] = rand.nextInt(100) + 1; //1~100の乱数を取得
			}
		return randomNumbers; //配列を返す
	}
		
	//Qes_6 メソッド　printAverage を定義
	public static double printAverage(int[] numbers) {
		int sum = 0;
		for (int num : numbers) { //ランダムな数を全て足す
			sum += num;
		}
		
		double average = (double) sum / numbers.length; //sum を配列の数で割る(平均値を求める)
		System.out.printf("平均値: %.2f\n", average); //小数第2位まで表示する
		return average; //配列を返す
	}
	
	//Qes_7 メソッド　check を定義
	public static boolean check(double average) {
		return average >= 50; //50以上なら true 50以下なら false を出力
	}
	
	
	//プログラムの開始点
	public static void main(String[] ages) {
			
	//Qes_1
	//[概要] 引数に文字列型と整数型を設定し出力するメソッドを作成 
		name("Hello JavaSE ", 11); //name を呼び出す
		System.out.println(""); //改行
			
			
	// Qes_2
	// [概要]　引数に整数を渡すと渡した値同士を乗算し出力するメソッドを作成
		Scanner scanner = new Scanner(System.in); //scannerオブジェクト作成
			
		System.out.print("数字を入力してください: ");
		long getNum = scanner.nextLong(); //数字を受け取る
			
		totalNum(getNum); //受け取った数字を使い totalNum を呼び出し
		System.out.println(""); //改行
			
			
	//Qes_3	
	// [概要] 引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成
		System.out.print("配列の要素数を入力してください");
		int size = scanner.nextInt(); //要素数を決める
		int[] myNumbers = new int[size]; //ユーザーが決めたサイズの配列を作成
			
		System.out.println(size + "個の整数を入力してください");
		for (int i = 0; i < size; i++) {
			myNumbers[i] = scanner.nextInt(); //整数を受け取る 
		}
			
		printArray(myNumbers); //メソッドを呼び出して配列を渡す
		System.out.println(""); //改行
			
			
	//Qes_4
	// [概要] Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力
		totalNum(10.35, 10.22); //小数を設定し totalNum を呼び出し
		System.out.println(""); //改行
		
		
	//Qes_5
	// [概要] 引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	//       格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成
		System.out.print("ランダムな数を何回生成しますか？: "); //ユーザーに回数を入力してもらう
		int count = scanner.nextInt();
		
		int[] numbers = generateRandomNumbers(count); //メソッドを呼び出してランダムな数を取得
		System.out.println("\n格納されたランダムな数一覧:");
		for (int num : numbers) {
		    System.out.println(num);  //ランダムな数を出力
		}
		System.out.println(""); //改行 
		
		
	//Qes_6
	// [概要] 引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成
		double average = printAverage(numbers);  //平均値を返す
		System.out.println(""); //改行
	
		
	//Qes_7
	// [概要] 引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力
		boolean result = check(average); //メソッドを呼び出す
		System.out.println(result); //出力
		
		scanner.close(); //scanner クラスを閉じる(リソースリーク防止)
	}
}


