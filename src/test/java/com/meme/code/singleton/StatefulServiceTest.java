package com.meme.code.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

class StatefulServiceTest {
  @Test
  void statefileServiceSingleton() {
    ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
    StatefulService statefulService1 = ac.getBean(StatefulService.class);
    StatefulService statefulService2 = ac.getBean(StatefulService.class);

    // 동일한 객체임..!
    int price1 = statefulService1.order("userA", 10000);
    int price2 = statefulService2.order("userB", 20000);

    System.out.println(price1);
    System.out.println(price2);

    Assertions.assertThat(price1).isNotEqualTo(price2);

  }

  static class TestConfig {
    @Bean
    public StatefulService statefulService() {
      return new StatefulService();
    }
  }
}