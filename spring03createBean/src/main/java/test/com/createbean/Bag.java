package test.com.createbean;

public class Bag {

	private Note note;
	private Pen pen;

	public Bag(Note note, Pen pen) {
		this.note = note;
		this.pen = pen;
	}

	@Override
	public String toString() {
		return "Bag [note=" + note + ", pen=" + pen + "]";
	}

}
