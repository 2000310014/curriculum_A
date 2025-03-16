package curriculum_1_26_28_setting;

public class Animal { //animalクラス作成
	protected String name; //動物の名前
	protected float height; //体長
	protected int speed; //速度
	
	//コンストラクタを作成
	public Animal(String name, float height, int speed) {
		this.name = name;
		this.height = height;
		this.speed = speed;
	}
	//動物の名前を取得するメソッド
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//体長を取得するメソッド
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	//速度を取得するメソッド
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
