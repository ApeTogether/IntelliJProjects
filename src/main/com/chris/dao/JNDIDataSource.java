package main.com.chris.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.jndi.JndiObjectFactoryBean;

public class JNDIDataSource {
	
	@Bean
	public JndiObjectFactoryBean dataSource() {
		JndiObjectFactoryBean jndiObjFB = new JndiObjectFactoryBean();
		jndiObjFB.setJndiName("jdbc/SpittrDS");
		jndiObjFB.setResourceRef(true);
		jndiObjFB.setProxyInterface(javax.sql.DataSource.class);
		return jndiObjFB;
	}
}
