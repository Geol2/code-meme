package com.meme.code;

import com.meme.member.Grade;
import com.meme.member.Member;
import com.meme.member.MemberService;

public class MemberApp {
  public static void main(String[] args) {
    AppConfig appConfig = new AppConfig();
    MemberService memberService = appConfig.memberService();
    // 개선 MemberService memberService = new MemberServiceImpl();

    Member member = new Member(1L, "memberA", Grade.VIP);
    memberService.join(member);

    Member findMember = memberService.findMember(1L);

    System.out.println("new Member = " + member.getName());
    System.out.println("find Member = " + findMember.getName());
  }
}
