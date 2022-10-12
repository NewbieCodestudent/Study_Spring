package test.com.createbean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Book {

	public String title;
	public int price;
	
	private static final Logger logger = LoggerFactory.getLogger(Book.class);

	public Book() {
		logger.info("Book()...");
	}
	
	public Book(String title, int price) {
		logger.info("Book(String title, int price)...");
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
}
