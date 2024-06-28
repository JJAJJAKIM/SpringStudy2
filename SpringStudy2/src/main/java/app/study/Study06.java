package app.study;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/s6")
public class Study06 {
	
	@Autowired
	private Study06Service service;
	@Autowired
	private Study06Dao study06dao;

	// Service에서 연산 호출하여 결과값 받아 오기
	@GetMapping("/{type}/{a}/{b}/{c}")
	public void url(@PathVariable int type, @PathVariable int a, @PathVariable int b, @PathVariable int c) {
		int value = service.run(type, a, b);
		log.info("run() : {} {}", value, (c == value) );
	}
	
	@GetMapping(value = {"/findAll/{value:[0-1]}", "/findAll"})
	public void url(@PathVariable(required = false) Object value) {
		List<Map> list = study06dao.findAll(value);
		log.info("temp1 LIST SIZE : {} ", list.size());
		
		for(Map map : list ) {
				log.info("temp1 LIST no title : {} {}", map.get("no"), map.get("title"));
				log.info("temp1 LIST content accept : {} {}", map.get("content"), map.get("accept"));
				log.info("temp1 LIST regDate : {}", map.get("regDate"));
		}
			
	}
}
