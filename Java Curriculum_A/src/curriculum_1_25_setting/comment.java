package curriculum_1_25_setting;

//Personクラスを継承する
public class comment extends Person {
	public comment (String name) {
		super(name); //Personクラスのコンストラクタを呼び出す
	}
	
	public void goComment() {
		System.out.println("さあ冒険に出かけよう！");
	}
}
