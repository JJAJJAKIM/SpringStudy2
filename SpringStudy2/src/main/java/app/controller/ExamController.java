package app.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import app.dto.ExamDTO;

@Controller
public class ExamController {

	@Autowired
	private SqlSession sqlSession;
	
	
	@GetMapping("/list")
	public String listpage(Model model) {
		
		List<ExamDTO> list = sqlSession.selectList("exam.findall");

		model.addAttribute("list", list);
		
		return "list";
	}
	
	@GetMapping("/new")
	public String newpage() {
		
		return "new";
	}
	
	@PostMapping("/insert")
	public void insertpage(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("title", title);
		map.put("content", content);
		
		int result = sqlSession.insert("exam.insert", map);
		if(result == 1) {
			res.sendRedirect("./detail?title="+title+"&content="+content);
		} else {
			sqlSession.rollback();
			res.sendRedirect("./new");
		}
		
	}
	
	
	@GetMapping("/detail")
	public String detailpage(Model model, HttpServletRequest req) {
		
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		System.out.println(title);
		model.addAttribute("title", title);
		model.addAttribute("content", content);
		
		return "detail";
	}
}
