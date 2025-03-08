package curriculum_1_23;

public class Main {
	public static void main(String[] args) {
		// Animalクラスのインスタンスを作成
		Animal animal = new Animal("ライオン", 2.1f, 80);
		// ゲッターを使って名前を取得
		System.out.println("動物名 : " + animal.getName());
		// ゲッターを使って体長を取得
		System.out.println("体長 : " + animal.getHeight() + "m");
		// ゲッターを使って速度を取得
		System.out.println("速度 : " + animal.getSpeed() + "km/h");
	}
}
