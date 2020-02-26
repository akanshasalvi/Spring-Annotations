package com.profile.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.profile.annotation")
@Import({DeveloperConfiguration.class, TesterConfiguration.class})
public class RootConfiguration {

}
