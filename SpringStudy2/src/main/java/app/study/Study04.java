package app.study;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/s4")
public class Study04 {

	// 경로 변수를 이용하여 화면 출력하기
	public String url1() {
		return "";
	}
	
	// 경로 변수에 따라 데이터 화면에 전달하기
	public String url2() {
		return "";
	}
	
}
