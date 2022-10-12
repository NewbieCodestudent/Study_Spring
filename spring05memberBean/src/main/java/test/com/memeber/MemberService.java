package test.com.memeber;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

	private static final Logger logger = LoggerFactory.getLogger(MemberService.class);
	
	@Autowired
	MemberDAO dao;
	
	public MemberService() {
		logger.info("MemberService()...");

	}
	
	public int insertOK(MemberVO vo) {
		logger.info("MemberService insertOK");
		
		return dao.insertOK(vo);
	}
	
	public int update(MemberVO vo) {
		logger.info("MemberService update");
		
		return dao.update(vo);
	}
	
	public int updateOK(MemberVO vo) {
		logger.info("MemberService updateOK");
		
		return dao.updateOK(vo);
	}
	
	public int delete(MemberVO vo) {
		logger.info("MemberService delete");
		
		return 1;
	}
	
	public int deleteOK(MemberVO vo) {
		logger.info("MemberService deleteOK");
		
		return 1;
	}
	
	public List<MemberVO> selectAll() {
		logger.info("MemberService insertOK");
		
		return dao.selectAll();
	}
	
	public MemberVO selectOne(MemberVO vo) {
		logger.info("MemberService selectOne");
		
		return vo;
	}
	
	public List<MemberVO> searchList(String SearchKey, String SearchWord) {
		logger.info("MemberService searchList");
		
		return dao.searchList(SearchKey, SearchWord);
	}
}
