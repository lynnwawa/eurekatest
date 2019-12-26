package com.nantian.abctest.sr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;

//import com.nantian.abctest.core.aop.log.OnlyAnnotationLoggerAdvices;

@SpringBootApplication
@EnableEurekaServer
public class AbctestRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbctestRegistryApplication.class, args);
	}

/*	@Bean
	public OnlyAnnotationLoggerAdvices smdbLoggerAdvices() {
		return new OnlyAnnotationLoggerAdvices();
	}*/
}
