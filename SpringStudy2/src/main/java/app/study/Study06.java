package app.study;


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

	// Service에서 연산 호출하여 결과값 받아 오기
	@GetMapping("/{value:[0-9]}")
	public void url(@PathVariable int value) {
		System.out.println(service.run(value));
	}	
}
