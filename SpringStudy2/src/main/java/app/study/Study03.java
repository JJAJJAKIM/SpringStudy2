package app.study;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/s3")
public class Study03 {
	
	@GetMapping("")
	public String jstl() {
		return "study/s3/jstl";
	}
	
	@GetMapping("/quest")
	public String quest(Model model) {
		return "study/s3/quest";
	}
	
}
