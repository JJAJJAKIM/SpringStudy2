package app.study;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/s4")
public class Study04 {

	// 경로 변수를 이용하여 화면 출력하기
	@GetMapping(value ={"/v/{page}","/v/"})  // url 패턴과 pathvariable의 변수명은 동일해야한다.
	public String url1(@PathVariable(name = "page", required = false) String page1) {
		// @PathVariable : name = 경로 변수명 지정
		// @PathVariable : value = 기본 경로 변수명 지정
		// @PathVariable : required = 기본은 true > false ( 경로 주소가 2개 이상이여야 한다.) 
		//화면 페이지는 4개지만 controller에서 처리하는 부분은 하나로 할수 있다.
		return "study/s4/" + page1;
	}
	
	// 경로 변수에 따라 데이터 화면에 전달하기
	@GetMapping("/data/{name}/{age}/{gender}")
	public String url2(@PathVariable Map<String, String> map, Model model) {		
		model.addAttribute(map);
		
		return "study/s4/quest";
	}
	
}
