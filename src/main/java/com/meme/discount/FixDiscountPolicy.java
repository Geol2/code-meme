package com.meme.discount;

import com.meme.member.Grade;
import com.meme.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

  private int discountFixAmount = 1000;

  @Override
  public int discount(Member member, int price) {

    if(member.getGrade() == Grade.VIP) {
      return discountFixAmount;
    } else {
      return 0;
    }

  }
}
