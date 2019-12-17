package SpringbootApp.First_springboot;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/*
 * While developing Spring based applications we may come across a need to register beans conditionally.

For example, you may want to register a DataSource bean pointing to the dev database while running application 
locally and point to a different production database while running in production. 

You can externalize the database connection parameters into the properties file and use the file appropriate 
for the environment, but you need to change the configuration whenever you need to point to a different environment and 
build the application.

To address this problem, Spring 3.1 introduced the concept of Profiles. You can register multiple beans of 
the same type and associate them with one or more profiles. When you run the application you can activate the desired 
profiles and beans associated with the activated profiles, and only those profiles will be registered.
 * 
 * 
 * 
 * */

@Configuration
public class ConditonalExample
{
 @Bean
 @Profile("DEV")
 public DataSource devDataSource() {
	return null;
 
 }
 @Bean
 @Profile("PROD")
 public DataSource prodDataSource() {
	return null;
 
 }
}