package curriculum_1_28_29_setting;

public class Prefecture { //Prefectureクラス作成
	protected String name; //都道府県
	protected String capital; //県庁所在地
	protected float area; //面積
	
	//コンストラクタを作成
	public Prefecture(String name, String capital, float area) {
		this.name = name;
		this.capital = capital;
		this.area = area;
	}
	//都道府県の名前を取得するメソッド
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//県庁所在地の名前を取得するメソッド
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	//面積の名前を取得するメソッド
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
}
