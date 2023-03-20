package com.meme.code;

import com.meme.member.Grade;
import com.meme.member.Member;
import com.meme.member.MemberService;
import com.meme.order.Order;
import com.meme.order.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {
  public static void main(String[] args) {
    // AppConfig appConfig = new AppConfig();
    // OrderService orderService = appConfig.orderService();
    // MemberService memberService = appConfig.memberService();
    // MemberService memberService = new MemberServiceImpl();
    // OrderService orderService = new OrderServiceImpl();

    /* @Bean 어노테이션을 찾아서 등록 */
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
    OrderService orderService = applicationContext.getBean("orderService", OrderService.class);

    Long memberId = 1L;
    Member member = new Member(memberId, "memberA", Grade.VIP);
    memberService.join(member);

    Order order = orderService.createOrder(memberId, "itemA", 10000);

    System.out.println("order = " + order);
  }
}
