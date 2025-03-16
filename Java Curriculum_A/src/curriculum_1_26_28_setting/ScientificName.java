package curriculum_1_26_28_setting;

public class ScientificName {
	public static String getScientificName(String name) {
        switch (name) { //動物の名前をチェック
            case "ライオン":
                return "パンテラ レオ";
            case "ゾウ":
                return "ロキソドンタ・サイクロティス";
            case "パンダ":
                return "アイルロポダ・メラノレウカ";
            case "チンパンジー":
                return "パン・トゥログロディテス";
            case "シマウマ":
                return "チャップマンシマウマ";
            case "インコ":
                return "不明"; // 不明とされている
                
            default:
                return "不明"; //他の動物も不明と出力
        }
    }
}
