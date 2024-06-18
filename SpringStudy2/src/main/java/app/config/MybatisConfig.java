package app.config;

import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class MybatisConfig {

	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.mariadb.jdbc.Driver");
		dataSource.setUrl("jdbc:mariadb://localhost:23306/edu");
		dataSource.setUsername("root");
		dataSource.setPassword("1234");
		return dataSource;
	}
	
	@Bean
	public SqlSessionFactory SqlSessionFactory(DataSource dataSource, ApplicationContext applicationContext ) throws Exception {
		SqlSessionFactoryBean SqlSessionFactoryBean = new SqlSessionFactoryBean();
		SqlSessionFactoryBean.setDataSource(dataSource);
		SqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:/sql/*.xml"));
		return SqlSessionFactoryBean.getObject();
	}
	
	@Bean
	public SqlSession sqlSession(SqlSessionFactory sqlSessionFactory) throws Exception {		
		return new SqlSessionTemplate(sqlSessionFactory);
	}
}