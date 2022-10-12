package test.com.hello;

import java.util.ArrayList;
import java.util.List;

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
	public String insert() {
		logger.info("Welcome insert");
		
		return "member/insert";
	}
	
	@RequestMapping(value = "/insertOK.do", method = RequestMethod.POST)
	public String insertOK(MemberVO vo) {
		logger.info("Welcome insertOK");
		logger.info("{}",vo);
		
		return "redirect:home.do";
	}
	
	@RequestMapping(value = "/selectOne.do", method = RequestMethod.GET)
	public String selectOne(MemberVO vo, Model model) {
		logger.info("Welcome selectOne");
		logger.info("{}",vo);
		
		MemberVO vo2 = new MemberVO(1,"admin","1234","kim","010");
		model.addAttribute("vo2",vo2);
		
		return "member/selectOne";
	}
	
	@RequestMapping(value = "/selectAll.do", method = RequestMethod.GET)
	public String selectAll(Model model) {
		logger.info("Welcome selectAll");
		
		List<MemberVO> vos = new ArrayList<MemberVO>();
		for (int i = 1; i < 6; i++) {
			MemberVO vo = new MemberVO();
			vo.setNum(i);
			vo.setId("admin"+i);
			vo.setPw("1234");
			vo.setName("kim"+i);
			vo.setTel("010-"+i+i+i+i+"-"+i+i+i+i);
			vos.add(vo);
		}
		model.addAttribute("vos",vos);
		
		return "member/selectAll";
	}
	
	@RequestMapping(value = "/update.do", method = RequestMethod.GET)
	public String update(Model model) {
		logger.info("Welcome update");
		
		return "member/update";
	}
	
	@RequestMapping(value = "/updateOK.do", method = RequestMethod.POST)
	public String updateOK(MemberVO vo, Model model) {
		logger.info("Welcome updateOK");
		logger.info("update : {}",vo);
		
		List<MemberVO> vos = new ArrayList<MemberVO>();
		for (int i = 1; i < 6; i++) {
			MemberVO vo2 = new MemberVO();
			vo2.setNum(i);
			vo2.setId("admin"+i);
			vo2.setPw("1234");
			vo2.setName("kim"+i);
			vo2.setTel("010-"+i+i+i+i+"-"+i+i+i+i);
			vos.add(vo2);
		}
		model.addAttribute("vos",vos);
		
		return "member/selectAll";
	}
	
	@RequestMapping(value = "/delete.do", method = RequestMethod.GET)
	public String delete(MemberVO vo) {
		logger.info("Welcome delete");
		
		return "member/delete";
	}
	
	@RequestMapping(value = "/deleteOK.do", method = RequestMethod.GET)
	public String deleteOK(Model model) {
		logger.info("Welcome deleteOK");
		
		List<MemberVO> vos = new ArrayList<MemberVO>();
		for (int i = 1; i < 6; i++) {
			MemberVO vo2 = new MemberVO();
			vo2.setNum(i);
			vo2.setId("admin"+i);
			vo2.setPw("1234");
			vo2.setName("kim"+i);
			vo2.setTel("010-"+i+i+i+i+"-"+i+i+i+i);
			vos.add(vo2);
		}
		model.addAttribute("vos",vos);
		
		return "member/selectAll";
	}
	
	@RequestMapping(value = "/searchList.do", method = RequestMethod.GET)
	public String deleteOK(Model model, String searchKey, String searchWord) {
		logger.info("Welcome searchList");
		logger.info("searchKey : {}",searchKey);
		logger.info("searchWord : {}",searchWord);
		
		List<MemberVO> vos = new ArrayList<MemberVO>();
		for (int i = 1; i < 3; i++) {
			MemberVO vo2 = new MemberVO();
			vo2.setNum(i);
			vo2.setId("admin"+i);
			vo2.setPw("1234");
			vo2.setName("kim"+i);
			vo2.setTel("010-"+i+i+i+i+"-"+i+i+i+i);
			vos.add(vo2);
		}
		model.addAttribute("vos",vos);
		
		return "member/selectAll";
	}
	
}
