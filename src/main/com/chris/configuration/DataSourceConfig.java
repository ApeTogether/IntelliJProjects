package com.chris.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jndi.JndiObjectFactoryBean;

import javax.sql.DataSource;

/**
 * @Auther Chris Lee
 * @Date 7/26/2018 12:52
 * @Description
 */
@Configuration
public class DataSourceConfig {
	
	/*
	 * @Bean public javax.sql.DataSource dataSource() { return new
	 * EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).addScript("schema.sql").build(); }
	 */
	
	@Bean
	public JdbcOperations jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}
	
	@Bean
	public JndiObjectFactoryBean dataSourceOfJNDI() {
		JndiObjectFactoryBean jndiObjFB = new JndiObjectFactoryBean();
		jndiObjFB.setJndiName("jdbc/SpittrDS");
		// jndiObjFB.setJndiName("jdbc/dataSource");
		jndiObjFB.setResourceRef(true);
		jndiObjFB.setProxyInterface(javax.sql.DataSource.class);
		return jndiObjFB;
	}
}
