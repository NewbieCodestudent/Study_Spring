package test.com.memeber;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOimpl implements MemberDAO {

	private static final Logger logger = LoggerFactory.getLogger(MemberDAOimpl.class);

	@Autowired
	Store store;
	
	@Autowired
	Bag bag;
	
	public MemberDAOimpl() {
		logger.info("MemberDAOimpl()...");
	}
	
	@Override
	public int insert(MemberVO vo) {
		logger.info("insert()...");
		logger.info("{}",vo);
		
		return 1;
	}

	@Override
	public int insertOK(MemberVO vo) {
		logger.info("insertOK()...");
		logger.info("{}",vo);
		
		return 1;
	}

	@Override
	public List<MemberVO> selectAll() {
		logger.info("selectAll()...");
		
		logger.info("{}",store);
		logger.info("{}",bag);
		
		store.car.start();
		bag.close();
		
		List<MemberVO> vos = new ArrayList<MemberVO>();
		for (int i = 1; i < 6; i++) {
			MemberVO vo = new MemberVO();
			vo.setNum(i);
			vo.setId("admin"+i);
			vo.setPw("pw"+i);
			vo.setName("kim"+i);
			vo.setTel("0"+i+"0");
			vos.add(vo);
		}
		return vos;
	}

	@Override
	public MemberVO selectOne(MemberVO vo) {
		logger.info("selectAll()...");
		
		return vo;
	}

	@Override
	public List<MemberVO> searchList(String searchKey, String SearchWord) {
		logger.info("selectAll()...");
		List<MemberVO> vos = new ArrayList<MemberVO>();
		for (int i = 1; i < 4; i++) {
			MemberVO vo = new MemberVO();
			vo.setNum(i);
			vo.setId("admin"+i);
			vo.setPw("pw"+i);
			vo.setName(SearchWord+i);
			vo.setTel("0"+i+"0");
			vos.add(vo);
		}
		return vos;
	}

	@Override
	public int update(MemberVO vo) {
		logger.info("update()...");
		logger.info("{}",vo);
		return 1;
	}

	@Override
	public int updateOK(MemberVO vo) {
		logger.info("updateOK()...");
		logger.info("{}",vo);
		return 1;
	}

	@Override
	public int delete(MemberVO vo) {
		logger.info("delete()...");
		logger.info("{}",vo);
		return 1;
	}

	@Override
	public int deleteOK(MemberVO vo) {
		logger.info("deleteOK()...");
		logger.info("{}",vo);
		return 1;
	}

}
