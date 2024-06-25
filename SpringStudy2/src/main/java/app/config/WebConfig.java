package app.config;

import javax.servlet.Filter;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import app.config.UTF8Filter;

public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return null; // 외부 설정 내용 등록(Mybatis)
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class[] {SpringConfig.class}; // Spring 관련 설정 내용 등록
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String[] {"/"}; // URL 패턴 등록
	}
	@Override
	protected Filter[] getServletFilters() {
		return new Filter[] {new UTF8Filter()};
	}
}
