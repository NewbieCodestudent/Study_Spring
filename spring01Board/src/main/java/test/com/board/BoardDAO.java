package test.com.board;

import java.util.List;

public interface BoardDAO {

	public int insert(BoardVO vo);
	public BoardVO update(BoardVO vo);
	public int updateOK();
	public int delete();
	public int deleteOK();
	public BoardVO selectOne(BoardVO vo);
	public List<BoardVO> selectAll();
	public List<BoardVO> searchList(String searchKey, String searchWord);
	
}
