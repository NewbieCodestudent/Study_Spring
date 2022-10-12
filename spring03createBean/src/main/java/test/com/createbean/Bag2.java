package test.com.createbean;

public class Bag2 {
	
	private Note note;
	private Pen pen;
	
	public Note getNote() {
		return note;
	}

	public void setNote(Note note) {
		this.note = note;
	}

	public Pen getPen() {
		return pen;
	}

	public void setPen(Pen pen) {
		this.pen = pen;
	}

	@Override
	public String toString() {
		return "Bag2 [note=" + note + ", pen=" + pen + "]";
	}
	
}
