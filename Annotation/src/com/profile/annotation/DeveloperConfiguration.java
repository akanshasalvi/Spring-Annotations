package com.profile.annotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:com/profile/annotation/application-developer.properties")
@Profile("dev")
public class DeveloperConfiguration {

}
