package test.com.createbean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Store2 {

	public Car car;
	public Book book;

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
		return "Store2 [car=" + car + ", book=" + book + "]";
	}
}