package test.com.createutil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestUtillContant implements count {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	private int max_value;
	private int count;
	
	
	public TestUtillContant() {
		// TODO Auto-generated constructor stub
	}
	
	public TestUtillContant(int max_value, int count) {
		logger.info("TestUtilContant(int max_value)...{}");
		logger.info("max_value:{}",max_value);
		logger.info("count:{}",count);
		this.max_value = max_value;
		this.count = count;
	}

}
