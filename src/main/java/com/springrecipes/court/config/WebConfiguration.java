package com.springrecipes.court.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.springrecipes.court.controllers.ReservationQueryController;
import com.springrecipes.court.service.ReservationService;
import com.springrecipes.court.service.ReservationServiceImpl;


@Configuration
@EnableWebMvc
public class WebConfiguration {

@Bean
public InternalResourceViewResolver internalResourceViewResolver() {
	InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
	viewResolver.setPrefix("/WEB-INF/jsp/");
	viewResolver.setSuffix(".jsp");
	return viewResolver;
}
@Bean
public ReservationService reservationService() {
	return new ReservationServiceImpl();
}

}
