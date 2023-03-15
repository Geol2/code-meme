package com.meme.discount;

import com.meme.member.Member;

public interface DiscountPolicy {

  int discount(Member member, int price);
}
