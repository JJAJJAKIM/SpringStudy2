package app.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HomeDao {
	
	@Autowired
	private SqlSession session;
	
	public List gugudanAll() {
		List<HashMap> list = session.selectList("sql.all");
		return list;
	}
	
	public List gugudanOne(int dan) {
		List<HashMap> list = session.selectList("sql.one", dan);
		return list;
	}
}
