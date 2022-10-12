package test.com.member;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/insert.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("insert");
		
		return "member/insert";
	}
	
	@RequestMapping(value = "/insertOK.do", method = RequestMethod.POST)
	public String hoinsertOKme(MemberVO vo, Model model) {
		logger.info("insertOK");
		logger.info("vo : {}", vo);
		
		List<MemberVO> vos = new ArrayList<MemberVO>();
		for (int i = 0; i < 5; i++) {
			MemberVO vo2 = new MemberVO();
			vo2.setNum(i);
			vo2.setId("admin"+i);
			vo2.setPw("1234");
			vo2.setName("name"+i);
			vo2.setTel("010");
			vos.add(vo2);
		}
		
		return "member/selectAll";
	}
	
	@RequestMapping(value = "/selectAll.do", method = RequestMethod.GET)
	public String selectAll(Model model) {
		logger.info("selectAll");
		
		List<MemberVO> vos = new ArrayList<MemberVO>();
		for (int i = 0; i < 5; i++) {
			MemberVO vo = new MemberVO();
			vo.setNum(i);
			vo.setId("admin"+i);
			vo.setPw("1234");
			vo.setName("name"+i);
			vo.setTel("010");
			vos.add(vo);
		}
		
		model.addAttribute("vos", vos);
		
		return "member/selectAll";
	}
	
	@RequestMapping(value = "/selectOne.do", method = RequestMethod.GET)
	public String selectOne(Model model) {
		logger.info("selectOne");
		
		MemberVO vo = new MemberVO(1,"admin","1234","kim","010");
		
		model.addAttribute("vo", vo);
		
		return "member/selectOne";
	}
	
	@RequestMapping(value = "/update.do", method = RequestMethod.GET)
	public String update(Model model) {
		logger.info("update");
		
		MemberVO vo = new MemberVO(1,"admin","1234","kim","010");
		
		model.addAttribute("vo", vo);
		
		return "member/update";
	}
	
	@RequestMapping(value = "/updateOK.do", method = RequestMethod.POST)
	public String updateOK(MemberVO vo, Model model) {
		logger.info("updateOK");
		logger.info("vo : {}",vo);
		
		return "member/selectAll";
	}
	
	@RequestMapping(value = "/delete.do", method = RequestMethod.GET)
	public String delete(Model model) {
		logger.info("delete");
		
		return "member/deleteOK";
	}
	
	@RequestMapping(value = "/deleteOK.do", method = RequestMethod.GET)
	public String deleteOK(Model model) {
		logger.info("deleteOK");
		
		return "member/selectAll";
	}
	
}
