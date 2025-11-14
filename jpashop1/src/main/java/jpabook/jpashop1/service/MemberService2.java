package jpabook.jpashop1.service;

import jpabook.jpashop1.domain.Member;
import jpabook.jpashop1.repository.MemberRepository2;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService2 {

    private final MemberRepository2 memberRepository2;

    @Transactional
    public Long join(Member member){
        // 중복된이름거르기!!!!!
        validateDuplicateMember(member);
        return memberRepository2.save(member);
    }

    private void validateDuplicateMember(Member member) {
        List<Member> findMembers = memberRepository2.findByName(member.getName());
        if(!findMembers.isEmpty()){
            throw new IllegalStateException("이미 존재하는 회원입니다!");
        }
    }

    public List<Member> findMembers(){
        return memberRepository2.findAll();
    }


    public Member findOne(Long memberId){
        return memberRepository2.findOne(memberId);
    }

}
