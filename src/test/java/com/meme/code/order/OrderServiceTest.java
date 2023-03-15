package com.meme.code.order;

import com.meme.member.Grade;
import com.meme.member.Member;
import com.meme.member.MemberService;
import com.meme.member.MemberServiceImpl;
import com.meme.order.Order;
import com.meme.order.OrderService;
import com.meme.order.OrderServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

  MemberService memberService = new MemberServiceImpl();
  OrderService orderService = new OrderServiceImpl();

  @Test
  void createOrder() {
    Long memberId = 1L;
    Member member = new Member(memberId, "memberA", Grade.VIP);
    memberService.join(member);

    Order order = orderService.createOrder(memberId, "itemA", 10000);

    Assertions.assertThat( order.getDiscountPrice()).isEqualTo(1000);
  }
}
