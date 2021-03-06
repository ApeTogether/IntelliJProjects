package com.chris.initializer;

import com.chris.configuration.RootConfig;
import com.chris.web.WebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @Auther Chris Lee
 * @Date 7/25/2018 18:04
 * @Description
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {RootConfig.class};
	}
	
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {WebConfig.class};
	}
	
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
