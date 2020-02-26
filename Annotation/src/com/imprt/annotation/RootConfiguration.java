package com.imprt.annotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({PassengerConfiguration.class, TicketConfiguration.class})
public class RootConfiguration {

}
