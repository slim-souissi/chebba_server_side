package org.sid;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@Configuration
public class SpringDataRestCustomization extends RepositoryRestConfigurerAdapter {
	@Override
	  public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {

	    config.getCorsRegistry().addMapping("/register")
	      .allowedOrigins("*")
	      .allowedMethods("PUT", "DELETE")
	      .allowedHeaders("header1", "header2", "header3")
	      .exposedHeaders("header1", "header2")
	      .allowCredentials(false).maxAge(3600);
	  }

}
