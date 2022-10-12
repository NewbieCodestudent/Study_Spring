package test.com.createbean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Car {

	public String model;
	public int price;
	
	private static final Logger logger = LoggerFactory.getLogger(Car.class);

	
	public Car() {
		logger.info("Car()...");
	}
	
	public Car(String model, int price) {
		logger.info("Car(String model, int price)...");
		this.model = model;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", price=" + price + "]";
	}
	
}
