package com.chris.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @Auther Chris Lee
 * @Date 7/25/2018 17:48
 * @Descriptionb
 */

@Configuration
@EnableJpaRepositories(basePackages = "com.chris.repository")
public class JpaConfiguration {
}
