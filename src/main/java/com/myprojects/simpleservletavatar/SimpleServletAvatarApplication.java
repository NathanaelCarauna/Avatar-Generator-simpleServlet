package com.myprojects.simpleservletavatar;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com.baeldung.boot.jsp")
@ServletComponentScan
public class SimpleServletAvatarApplication {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SimpleServletAvatarApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(SimpleServletAvatarApplication.class, args);
	}

	@Bean 
	public RestTemplate restTemplate(List<HttpMessageConverter<?>> messageConverters) { 
	return new RestTemplate(messageConverters); 
	} 

}
