package com.chris.configuration;

/**
 * @Auther Chris Lee
 * @Date 7/26/2018 12:52
 * @Description
 */
public class DataSourceConfig {
	
	/*
	 * @Bean public javax.sql.DataSource dataSource() { return new
	 * EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).addScript("schema.sql").build(); }
	 */
	
	/*@Bean
	public JdbcOperations jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}*/
	
	/*@Bean
	public JndiObjectFactoryBean dataSourceOfJNDI() {
		JndiObjectFactoryBean jndiObjFB = new JndiObjectFactoryBean();
		// jndiObjFB.setJndiName("jdbc/SpittrDS");
		jndiObjFB.setJndiName("jdbc/dataSource");
		jndiObjFB.setResourceRef(true);
		jndiObjFB.setProxyInterface(javax.sql.DataSource.class);
		return jndiObjFB;
	}*/
}
