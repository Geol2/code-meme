package com.meme.code;

import com.meme.discount.FixDiscountPolicy;
import com.meme.member.MemberService;
import com.meme.member.MemberServiceImpl;
import com.meme.member.MemoryMemberRepository;
import com.meme.order.OrderService;
import com.meme.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

  @Bean
  public FixDiscountPolicy getDiscountPolicy() {
    return new FixDiscountPolicy();
  }
  @Bean
  public MemoryMemberRepository getMemberRepository() {
    return new MemoryMemberRepository();
  }
  @Bean
  public MemberService memberService() {
    return new MemberServiceImpl(getMemberRepository());
  }
  @Bean
  public OrderService orderService() {
    return new OrderServiceImpl(getMemberRepository(), getDiscountPolicy());
  }
}
