package test.com.dbcp;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.tags.Param;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@Autowired
	MemberService service;
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
		
		return "home";
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home2(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert(Locale locale, Model model) {
		logger.info("insert()...");
		
		return "member/insert";
	}
	
	@RequestMapping(value = "/insertOK", method = RequestMethod.GET)
	public String insertOK(Model model, String id, String pw, String name, String tel) {
		logger.info("insertOK()...");
		logger.info("result:{}", service.insert(new MemberVO(0, id, pw, name, tel)));
		
		return "redirect:/selectAll";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(Model model, int num) {
		logger.info("update()...");
		MemberVO vo = new MemberVO();
		vo.setNum(num);
		MemberVO vo2 = service.selectOne(vo);
		logger.info("selectOne:{}", vo2);
		model.addAttribute("vo2",vo2);
		
		return "member/update";
	}
	
	@RequestMapping(value = "/updateOK", method = RequestMethod.GET)
	public String updateOK(Model model, int num, String id, String pw, String name, String tel) {
		logger.info("updateOK()...");
		logger.info("result:{}", service.update(new MemberVO(num, id, pw, name, tel)));
		
		return "redirect:/selectAll";
	}
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(Locale locale, Model model) {
		logger.info("delete()...");
		
		return "member/delete";
	}
	
	@RequestMapping(value = "/deleteOK", method = RequestMethod.GET)
	public String deleteOK(Model model, int num) {
		logger.info("updateOK()...");
		MemberVO vo = new MemberVO();
		vo.setNum(num);
		logger.info("result:{}", service.delete(vo));
		
		return "redirect:/selectAll";
	}
	
	@RequestMapping(value = "/selectOne", method = RequestMethod.GET)
	public String selectOne(Model model, int num) {
		logger.info("selectOne()...");
		MemberVO vo = new MemberVO();
		vo.setNum(num);
		MemberVO vo2 = service.selectOne(vo);
		logger.info("selectOne:{}", vo2);
		model.addAttribute("vo2",vo2);
		
		return "member/selectOne";
	}
	
	@RequestMapping(value = "/selectAll", method = RequestMethod.GET)
	public String selectAll(Locale locale, Model model) {
		logger.info("selectAll()...");
		List<MemberVO> vos = service.selectAll();
		logger.info("result:{}", vos.size());
		
		model.addAttribute("vos", vos);
		
		return "member/selectAll";
	}
	
	@RequestMapping(value = "/searchList", method = RequestMethod.GET)
	public String searchList(Model model, String sql, String key, String word) {
		logger.info("searchList()...");
		System.out.println(key+" "+word);
		List<MemberVO> vos = service.searchList(sql, key, word);
		logger.info("result:{}", vos.size());
		
		model.addAttribute("vos", vos);
		
		return "member/selectAll";
	}
	
}
