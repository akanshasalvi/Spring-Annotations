package com.profile.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:com/profile/annotation/application-tester.properties")

@Profile("tester")
public class TesterConfiguration {

}
