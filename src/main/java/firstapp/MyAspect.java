package firstapp;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect 
{
//	@Before("execution(* DAO.*(..))") //avant chaque méthode de DAOImpl
//	public void logBefore()
//	{
//		System.out.println("logBefore() is running!");
//	}
//	
//	@After("execution(* DAOImpl2.*(..))") //avant chaque méthode de DAOImpl
//	public void logAfter()
//	{
//		System.out.println("logAfter() is running!");
//	}
	
	@Around("execution(* DAO.*(..))")
	public void logAround(ProceedingJoinPoint pjp) throws Throwable
	{
		System.out.println(pjp.getStaticPart());
		Object[] args = pjp.getArgs(); //get the args of the function and print it
		for(Object o : args)
		{
			System.out.println("arg "+ o);
		}
		args[0]=73;
		pjp.proceed(args);//modifies the args of the function
		
		System.out.println("hey hey 2 ");
	}
}
