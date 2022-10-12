package test.com.memeber;

public class Store {

	public Car car;
	public Book book;
	
	public Store() {
		// TODO Auto-generated constructor stub
	}
	
	public Store(Car car, Book book) {
		this.car = car;
		this.book = book;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Store [car=" + car + ", book=" + book + "]";
	}

}