package test.com.createutil;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBean6 {

	@Override
	public String toString() {
		return "TestBean6 [map=" + map + "]";
	}

	private static final Logger logger = LoggerFactory.getLogger(TestBean6.class);

	public Map<String, String> map;
	
	public TestBean6() {
		logger.info("TestBean6()...");
	}
	
	public TestBean6(Map<String, String> map) {
		this.map = map;
	}
	
}