package test.com.memeber;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Car {
	
	private static final Logger logger = LoggerFactory.getLogger(MissionController.class);

	public String model;
	public int price;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void start() {
		logger.info("start()...");
		
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", price=" + price + "]";
	}

}
