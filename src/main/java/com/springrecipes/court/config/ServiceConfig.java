package com.springrecipes.court.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import com.springrecipes.court.service.ReservationService;
import com.springrecipes.court.service.ReservationServiceImpl;

@Configuration
public class ServiceConfig {
	@Bean
	public ReservationService reservationService() {
		return new ReservationServiceImpl();
	}
}
