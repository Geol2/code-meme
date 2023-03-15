package com.meme.code;

import com.meme.discount.FixDiscountPolicy;
import com.meme.member.MemberService;
import com.meme.member.MemberServiceImpl;
import com.meme.member.MemoryMemberRepository;
import com.meme.order.OrderService;
import com.meme.order.OrderServiceImpl;

public class AppConfig {

  private FixDiscountPolicy getDiscountPolicy() {
    return new FixDiscountPolicy();
  }

  private MemoryMemberRepository getMemberRepository() {
    return new MemoryMemberRepository();
  }

  public MemberService memberService() {
    return new MemberServiceImpl(getMemberRepository());
  }
  
  public OrderService orderService() {
    return new OrderServiceImpl(getMemberRepository(), getDiscountPolicy());
  }
}
