package test.com.createbean;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBean7 {

	private static final Logger logger = LoggerFactory.getLogger(TestBean7.class);

	public TestBean4 tb07;

	public TestBean4 getTb07() {
		return tb07;
	}

	public void setTb07(TestBean4 tb07) {
		this.tb07 = tb07;
	}

	@Override
	public String toString() {
		return "TestBean7 [tb07=" + tb07 + "]";
	}

}