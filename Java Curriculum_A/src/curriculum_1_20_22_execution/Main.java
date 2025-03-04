package curriculum_1_20_22_execution;

import curriculum_1_20_22_process.MessagePrint;

public class Main {
	public static void main(String[] args) {
		MessagePrint printer = new MessagePrint(
			"こんにちは！ここは日本です！",
			"この寿司はうまい",
			"寿司は和食です"		
		);
		printer.printMessages();
	}	
}
