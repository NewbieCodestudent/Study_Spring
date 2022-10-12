package test.com.createbean;

public class Pen {
	
	public String color;
	public int price;
	
	public Pen(String color, int price) {
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pen [color=" + color + ", price=" + price + "]";
	}
	
}
