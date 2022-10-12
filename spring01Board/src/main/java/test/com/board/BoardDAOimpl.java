package test.com.board;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOimpl implements BoardDAO {

	private static final Logger logger = LoggerFactory.getLogger(BoardDAOimpl.class);
	
	public BoardDAOimpl() {
		logger.info("BoardDAOimpl");
	}
	
	@Override
	public int insert(BoardVO vo) {
		return 1;
	}

	@Override
	public BoardVO update(BoardVO vo) {
		BoardVO vo2 = new BoardVO();
		vo2.setNum(1);
		vo2.setTitle("Title");
		vo2.setContent("Content");
		vo2.setWriter("admin");
		vo = vo2; 
		return vo;
	}

	@Override
	public int updateOK() {
		return 1;
	}

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int deleteOK() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public BoardVO selectOne(BoardVO vo) {
		BoardVO vo2 = new BoardVO();
		vo2.setNum(1);
		vo2.setTitle("Title");
		vo2.setContent("Content");
		vo2.setWriter("admin");
		vo = vo2; 
		return vo;
	}

	@Override
	public List<BoardVO> selectAll() {
		List<BoardVO> vos = new ArrayList<BoardVO>();
		for (int i = 1; i <= 10; i++) {
			BoardVO vo = new BoardVO();
			vo.setNum(i);
			vo.setTitle("title"+i);
			vo.setContent("Content"+i);
			vo.setWriter("admin"+i);
			vos.add(vo);
		}
		
		return vos;
	}

	@Override
	public List<BoardVO> searchList(String searchKey, String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

}
