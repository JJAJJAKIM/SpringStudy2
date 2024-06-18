package app.service;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import app.dto.ParamDTO;
import app.util.ParameterUtil;

@Service
public class HomeService {
	
	@Autowired
	private ParameterUtil pUtil;
	
	public void page2(Model model, ParamDTO pdto ) {
//		ParamDTO pdto = pUtil.param(req);
		int dan_sta = 1;
		int dan_end = 0;
		
		if(pdto.isState()) {
		
			Map map = pdto.getResult();
			String dan = map.get("dan").toString();
			
			if("A".equals(dan)) {
				dan_end = 10;
			}
			
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
				dan_sta = Integer.parseInt(dan);
				dan_end = dan_sta+1;
				break;
			}
	
			data(model, dan_sta, dan_end);
		} else {
			data(model, dan_sta, 10);
		}
	}
	
	private void data(Model model, int dan_sta, int dan_end) {
		List list = new ArrayList<>(); 
		for(int i = dan_sta; i < dan_end; i++) {
			List list2 = new ArrayList<>();
			for(int j= 1; j < 10; j++) {
				String str = i +" * "+ j + " = "+ (i*j);
				list2.add(str);
			}
			list.add(list2);
		}
		model.addAttribute("dan", dan_sta);
		model.addAttribute("list", list);
	}
}
