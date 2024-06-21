

package app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc // web.xml에서 어노테이션 사용관련 설정과 동일하다.
@ComponentScan(basePackages = {"app"})  //web.xml의 
public class SpringConfig implements WebMvcConfigurer {

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		
		InternalResourceViewResolver ivs = new InternalResourceViewResolver();
		ivs.setPrefix("/WEB-INF/v1/");
		ivs.setSuffix(".jsp");
		registry.viewResolver(ivs);
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/"); //web.xml의 화면단 파일과 URL매핑
	}

	
	
}
