package app.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/s6")
public class Study06 {
	
	@Autowired
	private Study06Service service;

	// Service에서 연산 호출하여 결과값 받아 오기
	public void url() {
		
	}	
}
