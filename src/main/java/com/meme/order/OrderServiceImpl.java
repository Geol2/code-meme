package com.meme.order;

import com.meme.discount.DiscountPolicy;
import com.meme.discount.FixDiscountPolicy;
import com.meme.member.Member;
import com.meme.member.MemberRepository;
import com.meme.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

  private final MemberRepository memberRepository; // DIP 인터페이스에 의존

  private final DiscountPolicy discountPolicy; // DIP 인터페이스에 의존

  public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
    this.memberRepository = memberRepository;
    this.discountPolicy = discountPolicy;
  }

  @Override
  public Order createOrder(Long memberId, String itemName, int itemPrice) {
    Member member = memberRepository.findById(memberId);
    int discountPrice = discountPolicy.discount(member, itemPrice);

    return new Order(memberId, itemName, itemPrice, discountPrice);
  }

  // 테스트용
  public MemberRepository getMemberRepository() {
    return memberRepository;
  }
}
