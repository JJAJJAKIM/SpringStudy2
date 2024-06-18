package app.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class HomeService2 {

	public void page4(Model model, HttpServletRequest req) {
		String dan = req.getParameter("dan");
		int sdan = 1;
		int edan = 0;
		
		if("A".equals(dan)|| dan == null){
			edan = 10;
		} else {
			switch (dan) {
				case "1":
				case "2":
				case "3":
				case "4":
				case "5":
				case "6":
				case "7":
				case "8":
				case "9":
					sdan = Integer.parseInt(dan);
					edan = sdan+1;
					break;
			}
		}		
		List list = new ArrayList<>();
		for(int i = sdan; i < edan; i++) {
			List list2 = new ArrayList<>();
			for(int j = 1; j < 10; j++) {
				String str = i + " * " + j + " = " +(i*j);
				list2.add(str); 					
			}
			list.add(list2);
		}
		model.addAttribute("dan",sdan);
		model.addAttribute("list",list);
		
	}
	
}
