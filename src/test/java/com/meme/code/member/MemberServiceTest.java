package com.meme.code.member;

import com.meme.member.Grade;
import com.meme.member.Member;
import com.meme.member.MemberService;
import com.meme.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

  MemberService memberService = new MemberServiceImpl();

  @Test
  void join() {
    // give when then
    Member member = new Member(1L, "memberA", Grade.VIP);

    memberService.join(member);
    Member findMember = memberService.findMember(1L);

    Assertions.assertThat(member).isEqualTo(findMember);
  }
}
