package firstapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


//méthode 3 qui se passe du xml
@org.springframework.context.annotation.Configuration
@ComponentScan({"firstapp"})
@EnableAspectJAutoProxy
public class Configuration 
{
	
	
	//alternative for the @Component annotation in Adresse and Contact
//	@Bean
//	public Adresse getAdresse()
//	{
//		return new Adresse("street","city",1);
//	}
//	
//	@Bean
//	public Contact getContact()
//	{
//		return new Contact("jhon","doe");
//	}
}
