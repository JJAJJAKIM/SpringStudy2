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
		model.addAttribute("var", "가");
		model.addAttribute("a", "나");
		model.addAttribute("array", new String[] {"가", "나", "다", "라"});
		model.addAttribute("s", 1);
		model.addAttribute("e", 9);
		return "study/s3/quest";
	}
	
}
