package com.meme.code.xml;

import static org.assertj.core.api.Assertions.assertThat;

import com.meme.member.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

public class XmlAppContext {
  @Test
  void xmlAppContext() {
    GenericXmlApplicationContext ac = new GenericXmlApplicationContext("appConfig.xml");
    MemberService memberService = ac.getBean("memberService", MemberService.class);
    assertThat(memberService).isInstanceOf(MemberService.class);
  }
}
