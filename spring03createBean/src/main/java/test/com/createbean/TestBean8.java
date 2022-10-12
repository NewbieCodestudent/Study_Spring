package test.com.createbean;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBean8 {

	private static final Logger logger = LoggerFactory.getLogger(TestBean8.class);

	public TestBean5 tb08;

	public TestBean5 getTb08() {
		return tb08;
	}

	public void setTb08(TestBean5 tb08) {
		this.tb08 = tb08;
	}

	@Override
	public String toString() {
		return "TestBean8 [tb08=" + tb08 + "]";
	}

}