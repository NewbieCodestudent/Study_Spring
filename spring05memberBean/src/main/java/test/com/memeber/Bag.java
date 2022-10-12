package test.com.memeber;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bag {

	private static final Logger logger = LoggerFactory.getLogger(MissionController.class);

	private Pen pen;
	private Note note;

	public Pen getPen() {
		return pen;
	}

	public void setPen(Pen pen) {
		this.pen = pen;
	}

	public Note getNote() {
		return note;
	}

	public void setNote(Note note) {
		this.note = note;
	}

	public void close() {
		logger.info("close()...");
	}

	@Override
	public String toString() {
		return "Bag [pen=" + pen + ", note=" + note + "]";
	}

}
