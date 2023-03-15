package com.meme.code;

import com.meme.member.Grade;
import com.meme.member.Member;
import com.meme.member.MemberService;
import com.meme.member.MemberServiceImpl;
import com.meme.order.Order;
import com.meme.order.OrderService;
import com.meme.order.OrderServiceImpl;

public class OrderApp {
  public static void main(String[] args) {
    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    Long memberId = 1L;
    Member member = new Member(memberId, "memberA", Grade.VIP);
    memberService.join(member);

    Order order = orderService.createOrder(memberId, "itemA", 10000);

    System.out.println("order = " + order);
  }
}
