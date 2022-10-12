package test.com.dbcp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOimpl {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberDAOimpl.class);

	@Autowired
	JdbcTemplate jdbcTemplate;

	public MemberDAOimpl() {
		// TODO Auto-generated constructor stub
	}
	
	public int insert(MemberVO vo) {
		logger.info("insert()...");
		logger.info("{}", vo);
		
		int flag = jdbcTemplate.update(MemberDB_oracle.SQL_INSERT, vo.getId(),vo.getPw(),vo.getName(),vo.getTel());
		
		return flag;
	}
	
	public int update(MemberVO vo) {
		logger.info("update()...");
		logger.info("{}",vo);
		
		int flag = jdbcTemplate.update(MemberDB_oracle.SQL_UPDATE, vo.getId(), vo.getPw(), vo.getName(), vo.getTel(), vo.getNum());
		
		return flag;
	}
	
	public int delete(MemberVO vo) {
		logger.info("delete()...");
		
		int flag = jdbcTemplate.update(MemberDB_oracle.SQL_DELETE, vo.getNum());
		
		return flag;
	}

	public List<MemberVO> selectAll() {
		logger.info("selectAll()...");
		
		List<MemberVO> vos = jdbcTemplate.query(MemberDB_oracle.SQL_SELECT_ALL, new Object[] {}, new RowMapper<MemberVO>() {
			@Override
			public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				logger.info("mapRow()...{}",rowNum);
				MemberVO vo = new MemberVO();
				vo.setNum(rs.getInt("num"));
				vo.setId(rs.getString("id"));
				vo.setPw(rs.getString("pw"));
				vo.setName(rs.getString("name"));
				vo.setTel(rs.getString("tel"));
				return vo;
			}
		});
		
		return vos;
	}
	
	public List<MemberVO> searchList(String sql, String key, String word) {
		logger.info("searchList()...");
		System.out.println(key+" "+word);
		if (key.equals("name")) {
			sql = MemberDB_oracle.SQL_SEARCH_LIST_NAME;
		}else if (key.equals("tel")) {
			sql = MemberDB_oracle.SQL_SEARCH_LIST_TEL;
		}
		List<MemberVO> vos = jdbcTemplate.query(sql, new Object[] {"%"+word+"%"}, new RowMapper<MemberVO>() {
			@Override
			public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				logger.info("mapRow()...{}",rowNum);
				MemberVO vo = new MemberVO();
				vo.setNum(rs.getInt("num"));
				vo.setId(rs.getString("id"));
				vo.setPw(rs.getString("pw"));
				vo.setName(rs.getString("name"));
				vo.setTel(rs.getString("tel"));
				return vo;
			}
		});
		return vos;
	}

	public MemberVO selectOne(MemberVO vo) {
		logger.info("selectOne()...");
		MemberVO vo2 = jdbcTemplate.queryForObject(MemberDB_oracle.SQL_SELECT_ONE, new Object[] {vo.getNum()}, new RowMapper<MemberVO> () {
			@Override
			public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				System.out.println(rowNum);
				logger.info("mapRow()...{}",rowNum);
				MemberVO vo = new MemberVO();
				vo.setNum(rs.getInt("num"));
				vo.setId(rs.getString("id"));
				vo.setPw(rs.getString("pw"));
				vo.setName(rs.getString("name"));
				vo.setTel(rs.getString("tel"));
				return vo;
			}
		});
		
		return vo2;
	}

//	public MemberDAOimpl(BasicDataSource ds) {
//		logger.info("className:{}",ds.getDriverClassName());
//		logger.info("url:{}",ds.getUrl());
//		logger.info("user:{}",ds.getUsername());
//		logger.info("pw:{}",ds.getPassword());
//	}
	
}
