package test.com.createbean;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBean9 {

	private static final Logger logger = LoggerFactory.getLogger(TestBean9.class);

	public TestBean6 tb09;

	public TestBean6 getTb09() {
		return tb09;
	}

	public void setTb09(TestBean6 tb09) {
		this.tb09 = tb09;
	}

	@Override
	public String toString() {
		return "TestBean9 [tb09=" + tb09 + "]";
	}

}