package test.com.component;

import java.util.List;

public interface MemberDAO {

	public int insert(MemberVO vo);
	public int insertOK(MemberVO vo);
	public MemberVO selectOne(MemberVO vo);
	public List<MemberVO> selectAll();
	public List<MemberVO> searchList(String searchKey, String SearchWord);
	public int update(MemberVO vo);
	public int updateOK(MemberVO vo);
	public int delete(MemberVO vo);
	public int deleteOK(MemberVO vo);

	
}
