package test.com.createutil;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBean5 {

	private static final Logger logger = LoggerFactory.getLogger(TestBean5.class);

	public Set<String> names;
	
	public TestBean5() {
		logger.info("TestBean5()...");
	}
	
	public TestBean5(Set<String> names) {
		this.names = names;
	}

	@Override
	public String toString() {
		return "TestBean5 [names=" + names + "]";
	}
	
}