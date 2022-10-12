package test.com.createbean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBean_GetSet {

	private static final Logger logger = LoggerFactory.getLogger(TestBean_GetSet.class);

	private int kor;
	private int eng;
	private int math;
	
	public TestBean_GetSet() {
		logger.info("TestBean_GetSet()...");
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public int getKor() {
		return kor;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getEng() {
		return eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getMath() {
		return math;
	}

	@Override
	public String toString() {
		return "TestBean_GetSet [kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
	
}
