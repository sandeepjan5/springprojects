package boot.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import scope.ScopeBo;
import scope.ScopeExample;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan("boot.jpa")
public class JPAApp 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(JPAApp.class, args);
        
        ConfigurableApplicationContext context = SpringApplication.run(ScopeExample.class, args);
    	ScopeBo b1 = context.getBean(ScopeBo.class);
    	b1.Show();
    	ScopeBo b2 = context.getBean(ScopeBo.class);
    	b2.Show();
    }
}
