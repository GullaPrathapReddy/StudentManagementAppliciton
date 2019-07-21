package com.stu.hostels;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import com.stu.hostels.config.Domain_Config;
import com.stu.hostels.config.Service_config;

@SpringBootApplication
@Import(value= {Domain_Config.class,Service_config.class})
public class BootStudentHostelsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootStudentHostelsApplication.class, args);
	}

	 @Bean
	    public FilterRegistrationBean corsFilterRegistration() {
	        FilterRegistrationBean registrationBean =
	                new FilterRegistrationBean(new CORSFilter());
	        registrationBean.setName("CORS Filter");
	        registrationBean.addUrlPatterns("/*");
	        registrationBean.setOrder(1);
	        return registrationBean;
	    }
}
