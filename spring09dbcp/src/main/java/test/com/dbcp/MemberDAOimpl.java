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
		
		int flag = jdbcTemplate.update("insert into member(num,id,pw,name,tel)"
				+ " values(seq_member.nextval,?,?,?,?)",
				vo.getId(),vo.getPw(),vo.getName(),vo.getTel());
		
		return flag;
	}

	public List<MemberVO> selectAll() {
		logger.info("selectAll()...");
		
		List<MemberVO> vos = jdbcTemplate.query("select * from member oreder by num desc", new Object[] {}, new RowMapper<MemberVO>() {
			@Override
			public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
		});
		
		return vos;
	}
	
//	public MemberDAOimpl(BasicDataSource ds) {
//		logger.info("className:{}",ds.getDriverClassName());
//		logger.info("url:{}",ds.getUrl());
//		logger.info("user:{}",ds.getUsername());
//		logger.info("pw:{}",ds.getPassword());
//	}
	
}
