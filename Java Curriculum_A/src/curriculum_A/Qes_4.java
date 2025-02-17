package curriculum_A;

public class Qes_4 {
	
	public static void main(String[] args) {
		
	//[概要]　短整数型に代入処理
	//[詳細]　11110を入力する。
		short shortNum = 100;
		System.out.println(shortNum);
		shortNum = 11110;
		System.out.println(shortNum);
	
	//[概要]　バイト型に代入処理
	//[詳細]　20を入力する。	
		byte byteNum = 10;
		System.out.println(byteNum);
		byteNum = 20;
		System.out.println(byteNum);
	
	//[概要]　文字型、文字列型、ブーリアン型に初期化処理
	//[詳細]　それぞれに入力をし、繋ぐ。	
		char charWord = 'a';
		String stringWord = "ハロー";
		boolean booleanWord = true;
		System.out.println(charWord +  " " + stringWord + " " + booleanWord);
	
	//[概要]　長整数型に代入処理
	//[詳細]　10000と1130を代入し、数字をたす。
		short Num1 = 1000;
		System.out.println(Num1);
		Num1 = 10000;
		short Num2 = 1130;
		System.out.println(Num1 + Num2);
		
	//[概要]　長整数型に代入処理
	//[詳細]　1000と1000000を代入し、小数点以外の数字をかける。
		long longNum = 1000;
		System.out.println(longNum);
		longNum = 10000;
		long longNum2 = 1000000;
		System.out.println(longNum * longNum2);
		
	//[概要]　倍精度浮動小数点型とバイト型に代入処理
	//[詳細]　10.5と100を代入する。10.5割る100をする。
		double doubleNum = 1.123;
		System.out.println(doubleNum);
		doubleNum = 10.5;
		byte byteNum1 = 100;
		System.out.println(doubleNum / byteNum1);	
	
	//[概要] バイト型に代入処理
	//[詳細]　10と100を代入する。10引く100をする。
		byte byteNum2 = 1;
		System.out.println(byteNum2);
		byteNum2 = 10;
		byte byteNum3 = 100;
		System.out.println(byteNum2 - byteNum3);
		
	}	
}


