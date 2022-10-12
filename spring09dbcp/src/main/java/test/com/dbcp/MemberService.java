package test.com.dbcp;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

	private static final Logger logger = LoggerFactory.getLogger(MemberService.class);
	
	@Autowired
	MemberDAOimpl dao;
	
	public MemberService() {
		logger.info("MemberService()...");

	}
	
	public int insert(MemberVO vo) {
		logger.info("MemberService insertOK");
		
		return dao.insert(vo);
	}
	
	public int update(MemberVO vo) {
		logger.info("MemberService update");
		
		return dao.update(vo);
	}
	
	public int delete(MemberVO vo) {
		logger.info("MemberService delete");
		
		return dao.delete(vo);
	}
	
	public List<MemberVO> selectAll() {
		logger.info("MemberService insertOK");
		
		return dao.selectAll();
	}
	
	public MemberVO selectOne(MemberVO vo) {
		logger.info("MemberService selectOne");
		
		return dao.selectOne(vo);
	}
	
	public List<MemberVO> searchList(String sql, String key, String word) {
		logger.info("MemberService searchList");
		
		return dao.searchList(sql, key, word);
	}
}
