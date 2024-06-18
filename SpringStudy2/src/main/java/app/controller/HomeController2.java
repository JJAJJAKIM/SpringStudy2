package app.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import app.service.HomeService2;


@Controller
public class HomeController2 {

	@GetMapping("/Home2")
	public String Home2() {		
		return "Home2";
	}
	
	@GetMapping("/page3")
	public String Page3() {
		return "page3";
	}
	
	@Autowired
	private HomeService2 hs2;
	
	@GetMapping("/page4")
	public String Page4(Model model, HttpServletRequest req) {
		hs2.page4(model, req);
		return "page4";
	}
	
}
