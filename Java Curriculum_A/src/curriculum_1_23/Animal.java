package curriculum_1_23;

public class Animal { //　Animalクラスを作成
	//　フィールドを作成
	private String name; //　動物名
	private float height; //　体長
	private int speed; //　速度
	
	// コンストラクタでフィールドに初期値を設定
	public Animal(String name, float height, int speed) {
		// nameがnullもしくは空文字なら空文字を設定
		this.name = (name != null && !name.isEmpty()) ? name : "";
		// heightが0以上ならそのまま、そうでなければ0を設定
		this.height = (height >= 0) ? height : 0;
		// speedが0以上ならそのまま、そうでなければ0を設定
		this.speed = (speed >= 0) ? speed : 0;
	}
	
	public String getName() { // ゲッター: 名前を取得するメソッド
		return name;
	}
	public void setName(String name) { // セッター: 名前を設定するメソッド
		this.name = name;
	}
	
	public float getHeight() { // ゲッター: 体長を取得するメソッド
		return height;
	}
	public void setHeight(float height) { // セッター: 体長を設定するメソッド
		this.height = height;
	}
	
	public int getSpeed() { // ゲッター: 速度を取得するメソッド
		return speed;
	}
	public void setSpeed(int speed) { // セッター: 速度を設定するメソッド
		this.speed = speed;
	}
}
