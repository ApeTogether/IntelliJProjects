package com.chris.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @Auther Chris Lee
 * @Date 7/26/2018 15:17
 * @Description
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.chris.web", "com.chris.controller"})
@PropertySource("classpath:version.properties")
public class WebConfig extends WebMvcConfigurerAdapter {


    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		super.addResourceHandlers(registry);
	}
	
	@Value("${version}")
	private String version;
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
			.apis(RequestHandlerSelectors.basePackage("com.chris.controller"))
			.paths(PathSelectors.any())
			.build()
			.apiInfo(apiInfo());
	}
	
	private ApiInfo apiInfo() {
		ApiInfo apiInfo = new ApiInfo("Spring MVC API", "the demo project of Spring MVC API.", version, "",
			new Contact("Chris.Le@asiainspection.com", "", ""), "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0");
		return apiInfo;
	}
}
