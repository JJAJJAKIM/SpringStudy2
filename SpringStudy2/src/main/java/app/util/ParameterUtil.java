package app.util;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import app.dto.ParamDTO;

@Component
public class ParameterUtil {

		public ParamDTO param( HttpServletRequest req) {
			// Enumeration은 화면에서 보내는 파라미터 값이 달라질 경우에도 사용할수 있게끔
			// getParameter부분을 공통 코드로 처리할 수 있게 해준다.
			ParamDTO pDto = new ParamDTO();
			pDto.setState(false);
			Enumeration enu = req.getParameterNames(); 				
			Map<String, String> map = new HashMap<String, String>();
			while(enu.hasMoreElements()) {				
				Object name = enu.nextElement();
//				System.out.println("name : " + name);
				String str = req.getParameter(name.toString());
//				System.out.println("value : " + str);
				map.put(name.toString(), str);
				pDto.setState(true);
			}
			pDto.setResult(map);
			return pDto;
		}
}
