package test.com.memeber;

public class Note {
	
	public String model;
	public int size;
	
	public Note(String model, int size) {
		this.model = model;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Note [model=" + model + ", size=" + size + "]";
	}
	
}
