package test.com.createbean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Store {

	public Car car;
	public Book book;
	
	private static final Logger logger = LoggerFactory.getLogger(Book.class);
	
	public Store() {
		logger.info("Store()...");
	}
	
	public Store(Car car, Book book) {
		this.car = car;
		this.book = book;
	}
	
	@Override
	public String toString() {
		return "Store [car=" + car + ", book=" + book + "]";
	}
}