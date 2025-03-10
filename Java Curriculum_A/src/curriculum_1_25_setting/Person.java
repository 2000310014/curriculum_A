package curriculum_1_25_setting;

import java.util.Random; //ランダムな数字を作成するインポート

public class Person { //Personクラスを作成
	protected String name; //名前
	protected int hp; //HP
	protected int mp; //MP
	protected int power; //攻撃力
	protected int speed; //素早さ
	protected int defence; //防御力
	
	//コンストラクタ作成
	public Person(String name) {
		//名前がない場合は「無名」にする
		this.name = (name != null && !name.isEmpty()) ? name : "無名";
		
		Random rand = new Random(); //ランダムな数字を作成
		this.hp = rand.nextInt(1000); //0~999までのランダムな数字を作成
		this.mp = rand.nextInt(1000);
		this.power = rand.nextInt(1000);
		this.speed = rand.nextInt(1000);
		this.defence = rand.nextInt(1000);
	}
	//名前を取得するメソッド
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//HPを取得するメソッド
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	//MPを取得するメソッド
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	//攻撃力を取得するメソッド
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	//素早さを取得するメソッド
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	//防御力を取得するメソッド
	public int getDefence() {
		return defence;
	}
	public void setDefence(int defence) {
		this.defence = defence;
	}
	
	//ステータスを表示するメソッド
	public void showStatus() {
		System.out.println("ステータス");
		System.out.println("HP : " + getHp());
		System.out.println("MP : " + getMp());
		System.out.println("攻撃力 : " + getPower());
		System.out.println("素早さ : " + getSpeed());
		System.out.println("防御力 : " + getDefence());
		System.out.println(""); //改行
	}
}
