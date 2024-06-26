package app.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import app.service.HomeService;
import app.util.ParameterUtil;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("title","title");
		return "home";
	}
	
	@GetMapping("/page1")
	public String page1(Model model, HttpServletRequest req) {
		
		String a = "";
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		
		if(req.getParameter("mark") != null) 
		a = req.getParameter("mark");
		if(req.getParameter("num2") != null) 
		num1 = Integer.parseInt(req.getParameter("num2"));
		if(req.getParameter("value") != null) 
		num2 = Integer.parseInt(req.getParameter("value"));
		
		switch (a) {
			case "+" : result = num1 + num2;
				break;
			case "-" : result = num1 - num2;
				break;
			case "/" : result = num1 / num2; 
				break;
			case "*" : result = num1 * num2;
				break;
			default :
		}
		System.out.println("num2 : " + num1 +", mark : " + a + ", value : " + num2);
		model.addAttribute("result", result);
		return "page1";
	}
	
	@Autowired
	private HomeService hs;
	@Autowired
	private ParameterUtil pUtil;
	
	@PostMapping("/page2")
	public String page2(Model model, HttpServletRequest req) { // Model은 화면에 데이터를 출력하기전 데이터를 담을 그릇. 데이터를 model에 담아놓기만 하면
		hs.page2(model, pUtil.param(req));					// Spring에서 화면단으로 보내주기 때문에 어디서 데이터를 담던 상관없이 UI로 보내준다.
		return "page2";
	}
	@Autowired
	private SqlSession session;
	
	@GetMapping("/test")
	public String test() {
		int no = session.selectOne("sql.test");
		System.out.println("no : "+ no);
		return "";
	}
	
	
}
