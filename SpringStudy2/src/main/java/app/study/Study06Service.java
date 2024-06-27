package app.study;

import org.springframework.stereotype.Service;

@Service
public class Study06Service {
	
	public int run(int type, int a, int b) {
		// 합, 곱 , 빼기, 나누기
		if(type == 1) {
			return 합(a, b);
		}
		if(type == 2) {
			return 빼기(a, b);
		}
		if(type == 3) {
			return 곱(a, b);
		}
		if(type == 4) {
			return 나누기(a, b);
		}
		
		return 0;
	}
	
	public int 합(int a , int b) {
		return a+b;
	}
	public int 곱(int a , int b) {
		return a*b;
	}
	public int 빼기(int a , int b) {
		return a-b;
	}
	public int 나누기(int a , int b) {
		return a/b;
	}
}
