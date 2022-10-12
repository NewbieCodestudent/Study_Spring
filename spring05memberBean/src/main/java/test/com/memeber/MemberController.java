package test.com.memeber;

import java.util.List;

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
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	MemberService service;
	
	public MemberController() {
		logger.info("MemberController()...");
	}
	
	@RequestMapping(value = "/insert.do", method = RequestMethod.GET)
	public String insert() {
		logger.info("MemberController insert");
		
		return "member/insert";
	}
	
	/**
	 * 회원가입 처리용
	 */
	@RequestMapping(value = "/insertOK.do", method = RequestMethod.GET)
	public String insertOK(MemberVO vo) {
		logger.info("MemberController insertOK");
		
		int result = service.insertOK(vo);
		logger.info("result : {}", result);
		
		return "redirect:/";
	}
	
	/* selectAll */
	@RequestMapping(value = "/selectAll.do", method = RequestMethod.GET)
	public String selectAll(Model model) {
		logger.info("MemberController selectAll");
		
		List<MemberVO> vos = service.selectAll();
		model.addAttribute("vos",vos);
		logger.info("vos : {}",vos);
		
		return "member/selectAll";
	}
	
	@RequestMapping(value = "/selectOne.do", method = RequestMethod.GET)
	public String selectOne(MemberVO vo, Model model) {
		logger.info("MemberController selectOne");
		
		MemberVO vo2 = service.selectOne(vo);
		model.addAttribute("vo",vo2);
		logger.info("vo : {}",vo);
		
		return "member/selectOne";
	}
	
	@RequestMapping(value = "/update.do", method = RequestMethod.GET)
	public String update(MemberVO vo, Model model) {
		logger.info("MemberController update");
		
		int result = service.update(vo);
		model.addAttribute("result",result);
		logger.info("vo : {}",result);
		
		return "member/update";
	}
	
	@RequestMapping(value = "/updateOK.do", method = RequestMethod.POST)
	public String updateOK(MemberVO vo, Model model) {
		logger.info("MemberController updateOK");
		
		int result = service.updateOK(vo);
		model.addAttribute("result",result);
		logger.info("vo : {}",result);
		
		return "redirect:/selectAll.do";
	}
	
	@RequestMapping(value = "/delete.do", method = RequestMethod.GET)
	public String delete(MemberVO vo, Model model) {
		logger.info("MemberController delete");
		
		int result = service.delete(vo);
		model.addAttribute("result",result);
		logger.info("vo : {}",result);
		
		return "member/delete";
	}
	
	@RequestMapping(value = "/deleteOK.do", method = RequestMethod.GET)
	public String deleteOK(MemberVO vo, Model model) {
		logger.info("MemberController deleteOK");
		
		int result = service.deleteOK(vo);
		model.addAttribute("result",result);
		logger.info("vo : {}",result);
		
		return "redirect:/selectAll.do";
	}
	
	@RequestMapping(value = "/searchList.do", method = RequestMethod.GET)
	public String searchList(String searchKey, String searchWord, Model model) {
		logger.info("MemberController searchList");
		
		List<MemberVO> vos = service.searchList(searchKey, searchWord);
		model.addAttribute("vos",vos);
		logger.info("vos : {}",vos);
		
		return "member/selectAll";
	}
	
}
