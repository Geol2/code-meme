package com.meme.member;

public class MemberServiceImpl implements MemberService {

  private final MemberRepository memberRepository; // DIP 추상화에만 의존

  public MemberServiceImpl(MemberRepository memberRepository) {
    this.memberRepository = memberRepository;
  }

  @Override
  public void join(Member member) {
    memberRepository.save(member);
  }

  @Override
  public Member findMember(Long memberId) {
    return memberRepository.findById(memberId);
  }

  // 테스트용
  public MemberRepository getMemberRepository() {
    return memberRepository;
  }

}
