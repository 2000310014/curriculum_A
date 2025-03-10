package curriculum_1_25_setting;

import java.util.Random;

public class Person {
	protected String name;
	protected int hp;
	protected int mp;
	protected int power;
	protected int speed;
	protected int defence;
	
	public Person(String name) {
		this.name = (name != null && !name.isEmpty()) ? name : "無名";
		
		Random rand = new Random();
		this.hp = rand.nextInt(1000);
		this.mp = rand.nextInt(1000);
		this.power = rand.nextInt(1000);
		this.speed = rand.nextInt(1000);
		this.defence = rand.nextInt(1000);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getDefence() {
		return defence;
	}
	public void setDefence(int defence) {
		this.defence = defence;
	}
	
	public void showStatus() {
		System.out.println("ステータス");
		System.out.println("HP : " + getHp());
		System.out.println("MP : " + getMp());
		System.out.println("攻撃力 : " + getPower());
		System.out.println("素早さ : " + getSpeed());
		System.out.println("防御力 : " + getDefence());
		System.out.println("");
	}
}
