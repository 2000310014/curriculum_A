package curriculum_1_20_22_process;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MessagePrint {
	private String message1;
	private String message2;
	private String message3;
	private String formattedDate;
	
	public MessagePrint(String message1, String message2, String message3) {
		this.message1 = message1;
		this.message2 = message2;
		this.message3 = message3;
		
		LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        this.formattedDate = now.format(formatter);
	}
	
	public void printMessages() {
		System.out.println(this.message1);
		System.out.println(this.message2);
		System.out.println(this.message3);
		System.out.println("今の現在の日時は" + this.formattedDate + "です");
	}
}
