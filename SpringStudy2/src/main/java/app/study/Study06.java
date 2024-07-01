package app.study;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestParam;


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
	public String url(@PathVariable(required = false) Object value, Model model) {
		List<Map> list = study06dao.findAll(value);
		log.info("temp1 LIST SIZE : {} ", list.size());
		model.addAttribute("list", list);
		return "study/s6/list";
			
	}
	@GetMapping("/new")
	public String newPage() {
		return "/study/s6/new";
	}
	
	@GetMapping("/detail/{no:[0-9]+}")
	public String detail(@PathVariable int no, Model model) {
		if(no > 0) {
			Map map =study06dao.findOne(no);
			model.addAttribute("map", map);
			return "/study/s6/detail";
		}
		return "redirect:/s6/findAll";
	}
	
	@PostMapping("/edit/{no:[0-9]+}")
	public String edit(@PathVariable int no, @RequestParam Map map) {
		if(service.editService(no, map) == 1) {
			return "redirect:/s6/detail/"+ no;			
		} else {
			return "study/s6/list";
		}
	}
	
	@GetMapping("/edit/{no:[0-9]+}/{accept:[0-1]}")
	public String edit(@PathVariable int no, @PathVariable int accept) {
		if(service.eidtService(no, accept) == 1) {
			return "redirect:/s6/detail/"+ no;			
		} else {
			return "study/s6/list";
		}
	}
	
	@GetMapping("/save")
	public String save(@RequestParam Map map) {
		int no = service.save(map);
		return "redirect:/s6/detail/"+ no;
		
	}
}
