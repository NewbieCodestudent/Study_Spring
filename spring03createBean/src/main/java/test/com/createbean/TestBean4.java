package test.com.createbean;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBean4 {

	@Override
	public String toString() {
		return "TestBean4 [names=" + names + "]";
	}

	private static final Logger logger = LoggerFactory.getLogger(TestBean4.class);

	public List<String> names;
	
	public TestBean4() {
		logger.info("TestBean4()...");
	}
	
	public TestBean4(List<String> names) {
		this.names = names;
	}
	
}