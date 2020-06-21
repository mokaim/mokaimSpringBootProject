package io.github.mokaim;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@MapperScan(value={"io.github.mokaim.mapper"})
@SpringBootApplication
public class MokaimBootSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MokaimBootSpringApplication.class, args);
	}
	
	@Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{
        
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        
        sessionFactory.setDataSource(dataSource);
        return sessionFactory.getObject();
        
    }



}
