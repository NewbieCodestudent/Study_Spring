package test.com.board;

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
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	BoardService service;
	
	@RequestMapping(value = "/selectAll", method = RequestMethod.GET)
	public String selectAll(Model model) {
		logger.info("Welcome selectAll");
		
		List<BoardVO> vos = service.selectAll();
		model.addAttribute("vos",vos);
		logger.info("vos : {}",vos);
		
		return "board/selectAll";
	}
	
	@RequestMapping(value = "/selectOne", method = RequestMethod.GET)
	public String selectOne(BoardVO vo, Model model) {
		logger.info("Welcome selectOne");
		
		vo = service.selectOne(vo);
		model.addAttribute("vo",vo);
		logger.info("vo : {}",vo);
		
		return "board/selectOne";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(BoardVO vo, Model model) {
		logger.info("Welcome update");
		
		vo = service.update(vo);
		model.addAttribute("vo",vo);
		logger.info("vo : {}",vo);
		
		return "board/update";
	}
	@RequestMapping(value = "/updateOK", method = RequestMethod.GET)
	public String updateOK() {
		logger.info("Welcome updateOK");
		int result = service.updateOK();
		logger.info("result : {}",result);
		
		return "redirect:/selectAll";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(BoardVO vo, Model model) {
		logger.info("Welcome delete");
		
		int result = service.delete();
		logger.info("result : {}",result);
		
		return "board/delete";
	}
	@RequestMapping(value = "/deleteOK", method = RequestMethod.GET)
	public String deleteOK() {
		logger.info("Welcome deleteOK");
		
		int result = service.deleteOK();
		logger.info("result : {}",result);
		
		return "redirect:/selectAll";
	}
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert(BoardVO vo) {
		logger.info("Welcome insert");
		
		int result = service.insert(vo);
		logger.info("result : {}",result);
		
		return "board/insert";
	}
	@RequestMapping(value = "/insertOK", method = RequestMethod.POST)
	public String insertOK(BoardVO vo) {
		logger.info("Welcome insertOK");
		
		int result = service.insertOK(vo);
		logger.info("result : {}",result);
		
		return "redirect:/selectAll";
	}
}
