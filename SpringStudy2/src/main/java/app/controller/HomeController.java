package app.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class HomeController {

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("name", "홍길동");
		return "Home";
	}
	
	@GetMapping("/page1")
	public String page1(Model model, HttpServletRequest req) {
		String a = req.getParameter("mark");
		String b = req.getParameter("value");
		String c = req.getParameter("history");
		System.out.println("history : " + c +", mark : " + a + ", value : " + b);
		return "page1";
	}
	@PostMapping("/page2")
	public String page2(Model model, HttpServletRequest req) {
		
		String dan = req.getParameter("dan");
		int b = 1;
		int a = 0;
		
		
		if(dan ==null || "A".equals(dan)) {
			b = 1;
			a = 10;
		} else if ("1".equals(dan)){
			b = 1;
			a = 2;
		} else if ("2".equals(dan)){
			b = 2;
			a = 3;
		} else if ("3".equals(dan)){
			b = 3;
			a = 4;
		} else if ("4".equals(dan)){
			b = 4;
			a = 5;
		} else if ("5".equals(dan)){
			b = 5;
			a = 6;
		} else if ("6".equals(dan)){
			b = 6;
			a = 7;
		} else if ("7".equals(dan)){
			b = 7;
			a = 8;
		} else if ("8".equals(dan)){
			b = 8;
			a = 9;
		} else if ("9".equals(dan)){
			b = 9;
			a = 10;
		}        
		
		List list = new ArrayList<>(); 
		for(int i = b; i < a; i++) {
			List list2 = new ArrayList<>();
			for(int j= 1; j < 10; j++) {
				String str = i +" * "+ j + " = "+ (i*j);
				System.out.println(str);
				list2.add(str);
			}
			list.add(list2);
		}
		model.addAttribute("dan", b);
		model.addAttribute("list", list);
		return "page2";
	}
	
}
