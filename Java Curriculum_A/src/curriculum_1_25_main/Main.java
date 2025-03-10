package curriculum_1_25_main;

import java.util.Scanner;

import curriculum_1_25_setting.comment;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("名前を入力してください");
		String name = scanner.nextLine();
		
		comment comment = new comment(name);
		
		System.out.println("こんにちは「 " + comment.getName() + " 」さん");
		
		comment.showStatus();
		
		comment.goComment();
		
		scanner.close();
	}
}
	
