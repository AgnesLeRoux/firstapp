package firstapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) 
	{
		//methode qui se passe du xml (3)
		//lance le spring (le sac de haricots) via les annotations
		ApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
		
//		ApplicationContext context =
//				new ClassPathXmlApplicationContext(new String[] {"spring.xml"});
		
//		Contact c = context.getBean(Contact.class);
//		System.out.println(c);
//		
//		Adresse a = context.getBean(Adresse.class);
//		System.out.println(a);
		
		//on cherche un bean dans le sac par sa spécification
		context.getBean(DAO.class).C(42);
		System.out.println(context.getBean(DAO.class));
	}
}
