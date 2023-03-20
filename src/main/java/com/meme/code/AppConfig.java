package com.meme.code;

import com.meme.discount.DiscountPolicy;
import com.meme.discount.FixDiscountPolicy;
import com.meme.member.MemberRepository;
import com.meme.member.MemberService;
import com.meme.member.MemberServiceImpl;
import com.meme.member.MemoryMemberRepository;
import com.meme.order.OrderService;
import com.meme.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

  // @Bean memberService -> new MemoryMemberRepository()
  // @Bean orderService -> new MemberMemberRepository()

  /*@Bean
  public FixDiscountPolicy getDiscountPolicy() {
    return new FixDiscountPolicy();
  }

  @Bean
  public MemoryMemberRepository getMemberRepository() {
    return new MemoryMemberRepository();
  }*/

  @Bean
  public MemberService memberService() {
    // System.out.println("Call AppConfig.memberService");
    return new MemberServiceImpl(memberRepository());
  }

  @Bean
  public MemberRepository memberRepository() {
    // System.out.println("Call AppConfig.memberRepository");
    return new MemoryMemberRepository();
  }

  @Bean
  public OrderService orderService() {
    // System.out.println("Call AppConfig.orderService");
    return new OrderServiceImpl(memberRepository(), discountPolicy());
  }

  @Bean
  public DiscountPolicy discountPolicy() {
    // System.out.println("Call AppConfig.discountPolicy");
    return new FixDiscountPolicy();
  }
}
