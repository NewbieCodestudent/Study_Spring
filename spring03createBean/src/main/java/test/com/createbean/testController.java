package test.com.createbean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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
public class testController {
	
	private static final Logger logger = LoggerFactory.getLogger(testController.class);
	
	@Autowired
	ArrayList<String> alist;
	@Autowired
	ArrayList<String> blist;
	//bean에 name을 부여 후 name으로 call하는 방법
	@Autowired
	ArrayList<String> names;
	
	// HashSet
	@Autowired
	HashSet<String> aset;
	// HashMap
	@Autowired
	HashMap<String, String> map;
	
	// Car, Book
	@Autowired
	Car testcar;
	@Autowired
	Book testbook;
	
	// Store, Store2
	@Autowired
	Store mstore;
	@Autowired
	Store2 mstore2;
	@Autowired
	Store tstore;
	@Autowired
	Store tstore2;
	@Autowired
	TestBean4 testbean4;
	@Autowired
	TestBean4 testbean4_list;
	@Autowired
	TestBean5 testbean5;
	@Autowired
	TestBean6 testbean6;
	
	@RequestMapping(value = "/test.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome test!", locale);
		
		logger.info("alist.size:{}",alist.size());
		alist.add("lee1");
		alist.add("lee1");
		alist.add("lee1");
		for (String x : alist) {
			logger.info("{}",x);
		}
		logger.info("===========================");
		logger.info("blist.size:{}",blist.size());
		blist.add("lee2");
		blist.add("lee2");
		blist.add("lee2");
		for (String x : blist) {
			logger.info("{}",x);
		}
		logger.info("===========================");
		logger.info("names.size:{}",names.size());
		names.add("han3");
		names.add("han3");
		names.add("han3");
		for (String x : names) {
			logger.info("{}",x);
		}
		
		//HashSet<Integer> add 4개
		logger.info("===========================");
		logger.info("aset.size:{}",aset.size());
		for (String x : aset) {
			logger.info("{}",x);
		}
		
		//HashMap<String, String> put 2개
		logger.info("===========================");
		logger.info("map.size:{}",map.size());
		logger.info("map.size:{}",map.keySet());
		logger.info("map.size:{}",map.values());
		
		// Car, Book
		logger.info("===========================");
		logger.info("car:{}",testcar);
		logger.info("Book:{}",testbook);
		
		// Store, Store2
		logger.info("===========================");
		logger.info("mStore:{}",mstore);
		logger.info("mStore:{}",mstore2);
		logger.info("tStore:{}",tstore);
		logger.info("tStore2:{}",tstore2);

		// TestBean4
		logger.info("===========================");
		logger.info("TestBean4:{}",testbean4);
		logger.info("testbean4_list:{}",testbean4_list);
		logger.info("testbean5:{}",testbean5);
		logger.info("testbean6:{}",testbean6);
		
		return "home";
	}
	
}