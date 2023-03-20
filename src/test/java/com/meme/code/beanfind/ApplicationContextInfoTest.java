package com.meme.code.beanfind;

import com.meme.code.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextInfoTest {
  AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

  @Test
  @DisplayName("모든 빈 출력하기")
  void findAllBean() {
    String[] beanDefinitionNames = ac.getBeanDefinitionNames();
    for(String beanDefinotionName : beanDefinitionNames) {
      Object bean = ac.getBean(beanDefinotionName);
      System.out.println("name = " + beanDefinotionName + " object = " + bean);
    }
  }

  @Test
  @DisplayName("애플리케이션 빈 출력하기")
  void findApplicationBean() {
    String[] beanDefinitionNames = ac.getBeanDefinitionNames();
    for(String beanDefinitionName: beanDefinitionNames) {
      BeanDefinition beanDefinition = ac.getBeanDefinition(beanDefinitionName);

      if(beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION) {
        // 애플리케이션의 빈을 출력할 수 있ㄷ다
        Object bean = ac.getBean(beanDefinitionName);
        System.out.println("name = " + beanDefinitionName + " object = " + bean);
      }
    }
  }
}
