package com.example.ObjectUtil;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service
public class BeanService implements ApplicationContextAware {
  private static ApplicationContext context;
  
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    context = applicationContext;
  }
  
  public static <T> T getBean(Class<T> beanClass) {
    return (T)context.getBean(beanClass);
  }
}
