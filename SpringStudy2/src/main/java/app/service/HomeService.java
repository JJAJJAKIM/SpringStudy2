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
		if(pdto.isState()) {
		
			Map map = pdto.getResult();
			String dan = map.get("dan").toString();
			int b = 1;
			int a = 0;
			
			if("A".equals(dan)) {
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
					list2.add(str);
				}
				list.add(list2);
			}
			model.addAttribute("dan", b);
			model.addAttribute("list", list);
		}
	}

}
