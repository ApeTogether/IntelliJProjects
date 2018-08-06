package com.chris.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Auther Chris Lee
 * @Date 8/6/2018 10:50
 * @Description
 */

@Configuration
@EnableWebMvc
@EnableSwagger2
public class SwaggerConfiguration {
/*
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

*/}
