package com.example.demo.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.junit.After;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Configuration
public class LogAspect {

	  private Logger logger = LoggerFactory.getLogger(this.getClass());
	//private static final Looger log = 
  @Before("execution(public * com.example.demo*.Service.*(..))")
  public void log(JoinPoint joinPoint) {
    System.out.printf("Appel de %s avec %d paramètres%n",
                      joinPoint.toShortString(),
                      joinPoint.getArgs().length);
  }
  
  
  
  @AfterReturning(value = "execution(public * com.example.demo*.Service.*(..))",
	        returning = "result")
	    public void afterReturning(JoinPoint joinPoint, Object result) {
	        logger.info("{} returned with value {}", joinPoint, result);
	    }
  


 
  
}
