package com.netapp.support_encyclopedia.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@ComponentScan("com.netapp.support_encyclopedia")
@EnableWebMvc
public class SupportEncyclopediaContextConfig {
	
//	@Bean(name="viewResolver")
//	public InternalResourceViewResolver getViewResolver(){
//		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
//		viewResolver.setPrefix("/WEB-INF/views/");
//		viewResolver.setSuffix(".jsp");
//		return viewResolver;
//	}
//	
//	@Bean(name="dataSource")
//	public DataSource getDataSource(){
//	
//		DriverManagerDataSource dataSource=new DriverManagerDataSource();
//		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//		dataSource.setUrl("jdbc:mysql://localhost:3306/solution_advisor");
//		dataSource.setUsername("root");
//		dataSource.setPassword("root");
//		
//		return dataSource;
//	}
//	
//	@Autowired
//	@Bean(name="sessionFactory")
//	public SessionFactory getSessionFactory(DataSource dataSource){
//		LocalSessionFactoryBuilder sBuilder=new LocalSessionFactoryBuilder(dataSource);
//		sBuilder.setProperty("hibernate.show_sql", "true");
//		sBuilder.addAnnotatedClasses(Product.class);
//		
//		return sBuilder.buildSessionFactory();
//	}
//	
//	@Autowired
//	@Bean(name="transactionManager")
//	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory){
//		HibernateTransactionManager transactionManager=new HibernateTransactionManager(sessionFactory);
//		return transactionManager;
//		
//	}
//	
//	@Autowired
//	@Bean(name="ProductDAO")
//	public ProductDAO getProductDAO(SessionFactory sessionFactory){
//		return new ProductDAOImpl(sessionFactory);
//	}

	
	
	
	

}
