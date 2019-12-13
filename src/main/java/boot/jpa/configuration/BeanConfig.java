package boot.jpa.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import boot.jpa.service.LoginService;

@Configuration
public class BeanConfig {
	
	@Bean
	LoginService getLoginService(){
	 return new LoginService();	
	}
	
	

}
