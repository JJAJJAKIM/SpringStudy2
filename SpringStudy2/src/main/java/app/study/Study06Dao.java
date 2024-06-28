package app.study;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class Study06Dao {
	
	private final SqlSession sqlSession;
	
	public List<Map> findAll(Object value){

		return sqlSession.selectList("sql.findAccept", value);
	}
}
