package test.com.member;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MemberDAOimpl {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberDAOimpl.class);


	public MemberDAOimpl() {
		// TODO Auto-generated constructor stub
	}
	
	public MemberDAOimpl(String className, String url, String user, String pw) {
		logger.info("className:{}",className);
		logger.info("url:{}",url);
		logger.info("user:{}",user);
		logger.info("pw:{}",pw);
	}
	
}
