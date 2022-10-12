package test.com.memeber;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MemberConfig {
	
	private static final Logger logger = LoggerFactory.getLogger(MissionController.class);

	@Bean
	public Pen pen(String color, int price) {
		logger.info("bean pen()...");
		Pen pen = new Pen(color, price);
		pen.color = "red";
		pen.price = 5555;
		return pen;
	}
	
	@Bean
	public Note note(String model, int size) {
		logger.info("bean note()...");
		Note note = new Note(model, size);
		note.model = "monami";
		note.size = 77;
		return note;
	}
	
	@Bean
	public Bag bag(Pen pen, Note note) {
		logger.info("bean bag()...");
		Bag b = new Bag();
		b.setPen(pen);
		b.setNote(note);
		return b;
	}

}
