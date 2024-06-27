package app.study;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/s5")
public class Study05 {
	
	/**********************************************************
	 * 정규 표현식 (Regular Expression)
	 * 메타문자 : . ^ $ * + ? {} [] \ | ()
	 **********************************************************
	 * 예제 			: 설명
	 * [a-zA-Z] 	: 영문 대소문자 모두 매치
	 * [0-9] 		: 숫자 모두 매치 >> "\d"
	 * [^0-9] 		: 숫자가 아닌 문자만 매치 >> "\D"
	 * [a-zA-Z0-9_] : 문자+숫자 매치 >> "\w"
	 * [^a-zA-Z0-9_] : 문자+숫자가 아닌 문자와 매치 >> "\W" 
	 * [\t\n\f\r] 	: 공백문자와 탭 매치 >> "\s"
	 * [^\t\n\f\r] 	: 공백문자 외 문자 매치 >> "\S"
	 **********************************************************
	 * 반복 : 조건
	 * * 			: 0회 허용 반복
	 * + 			: 1회 부터 반복
	 * {m,n} 		: 시작, 끝 정의 반복
	 * ? 			: 반복의 개념은 아니지만 0, 1 같은 둘 다 허용 매치 
	 **********************************************************/

	@GetMapping("/v/{value:[a-zA-Z]*}")
	public void url1(@PathVariable String value) {
		System.out.println("value : " + value);
	}
	
	@GetMapping("/v/{value:[0-9]+}")
	public void url2(@PathVariable String value) {
		System.out.println("value2 : " + value);
	}
	
	@GetMapping("/{value:[a-zA-Z]{4}[0-9]}")
	public String url3(@PathVariable String value) {
		System.out.println("value3 : " + value);
		return "study/s4/"+value;
	}
	
	@GetMapping("/{value:[qQ][uU][eE][sS][tT]}")
	public String url4(@PathVariable  String value) {
		
		return "study/s4/" + value.toLowerCase();
	}
	
	//주민번호를 넣어서 정상이면 출력하세요.
	// 년도(2) 월(2) 일(2) 성별[1-4] 구분(6)
	@GetMapping("/{value:[0-9]{2}[0-1][0-9][0-3][0-9][1-4][0-9]{6}}")
	public void url5(@PathVariable String value) {
		System.out.println(value);
	}
	
}
