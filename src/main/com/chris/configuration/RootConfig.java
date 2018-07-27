package com.chris.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Auther Chris Lee
 * @Date 7/26/2018 15:20
 * @Description
 */
@Configuration
@ComponentScan(basePackages = {"com.chris"}, excludeFilters = {
	@ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)})
public class RootConfig {
	/*
	 * public static class WebPackage extends RegexPatternTypeFilter { public WebPackage() {
	 * super(Pattern.compile("spittr\\.web")); } }
	 */
}