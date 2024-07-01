package app.study;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class Study06Service {
	
	private final Study06Dao study06dao;
	
	
	public int run(int type, int a, int b) {
		// 합, 곱 , 빼기, 나누기
		if(type == 1) {
			return 합(a, b);
		}
		if(type == 2) {
			return 빼기(a, b);
		}
		if(type == 3) {
			return 곱(a, b);
		}
		if(type == 4) {
			return 나누기(a, b);
		}
		
		return 0;
	}
	
	public int 합(int a , int b) {
		return a+b;
	}
	public int 곱(int a , int b) {
		return a*b;
	}
	public int 빼기(int a , int b) {
		return a-b;
	}
	public int 나누기(int a , int b) {
		return a/b;
	}

	public int editService(int no, Map map) {
		if(no>0) {
			map.put("no", no);
			return study06dao.edit(map);	
		} else {
			return 0;
		}
	}
	
	public int eidtService(int no, int accept) {
		if(no>0) {
			Map map = new HashMap<>();
			map.put("no", no);
			map.put("accept", accept);
			return study06dao.editaccept(map);
		} else {
			return 0;
		}
	}
	
	public int save(Map map) {
		map = study06dao.save(map);
		Object obj = map.get("no");
		if(obj != null ) {
			int no = Integer.parseInt(obj.toString());
			return no; 
		}
		return 0;
	}
}
