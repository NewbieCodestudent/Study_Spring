package test.com.createbean;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	// bean의 아이디의 값으로 호출
	@Autowired
	TestBean tb01;
	@Autowired
	TestBean tb02;
	@Autowired
	TestBean_GetSet tb03;
	@Autowired
	Car car;
	@Autowired
	Book book;
	@Autowired
	Store store;
	@Autowired
	Store2 store2;
	@Autowired
	Note note;
	@Autowired
	Pen pen;
	@Autowired
	Bag bag;
	@Autowired
	Bag2 bag2;
	@Autowired
	TestBean4 tb04;
	@Autowired
	TestBean5 tb05;
	@Autowired
	TestBean6 tb06;
	@Autowired
	TestBean7 tb07;
	@Autowired
	TestBean8 tb08;
	@Autowired
	TestBean9 tb09;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		logger.info("{}", tb01);
		logger.info("{}", tb02);
		logger.info("{}", tb03);
		logger.info("{}", car);
		logger.info("{}", book);
		logger.info("{}", store);
		logger.info("{}", store2);
		logger.info("{}", note);
		logger.info("{}", pen);
		logger.info("{}", bag);
		logger.info("{}", bag2);
		logger.info("{}", tb04.names.size());
		for (String name : tb04.names) {
			logger.info("{}", name);
		}
		logger.info("{}", tb05.names.size());
		for (String name : tb05.names) {
			logger.info("{}", name);
		}
		logger.info("{}", tb06.map.size());
		logger.info("{}", tb06.map.get("name"));
		logger.info("{}", tb06.map.get("age"));
		logger.info("{}", tb07.tb07.names.size());
		for (String name : tb07.tb07.names) {
			logger.info("{}",name);
		}
		logger.info("{}", tb08.tb08.names.size());
		for (String name : tb08.tb08.names) {
			logger.info("{}", name);
		}
		logger.info("{}", tb09.tb09.map.size());
		logger.info("{}", tb09.tb09.map.get("name"));
		logger.info("{}", tb09.tb09.map.get("age"));
		
		return "home";
	}
	
}
