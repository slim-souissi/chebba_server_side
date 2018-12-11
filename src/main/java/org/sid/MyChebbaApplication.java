package org.sid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;

import services.StorageService;

import javax.annotation.Resource;
import javax.servlet.MultipartConfigElement;

@SpringBootApplication
public class MyChebbaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyChebbaApplication.class, args);
	}
	
	/*@Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setMaxFileSize("10240KB");
        factory.setMaxRequestSize("10240KB");
        return factory.createMultipartConfig();
    }*/

	
}
