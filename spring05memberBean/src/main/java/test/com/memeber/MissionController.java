package test.com.memeber;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MissionController {
	
	private static final Logger logger = LoggerFactory.getLogger(MissionController.class);
	
	@Autowired
	Car car;
	@Autowired
	Book book;
	
	@RequestMapping(value = "home.do", method = RequestMethod.GET)
	public String home() {
		
		logger.info("Car:{}",car);
		logger.info("Book:{}",book);
		
		return "home";
	}
	
}
