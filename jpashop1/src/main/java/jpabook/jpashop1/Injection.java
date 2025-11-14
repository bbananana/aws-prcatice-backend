package jpabook.jpashop1;

import jpabook.jpashop1.domain.Member;
import jpabook.jpashop1.repository.MemberRepository;
import jpabook.jpashop1.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;

// DI(Dependency Injection)
public class Injection {

    /*
          1. 필드 주입 : @Autowired를 통해 바로 필드에 의존성 주입
                        간단! , 테스트나 유지보수에 불편함!
          2. setter 주입  : @Autowired 된 세터 메서드를 호출!
                        선택가능! 다른곳에서 변경이 되버릴수 있다....
          3. 생성자 주입 : 스프링이 생성자 호출 시점에 의존성을 주입
                        final 키워드 : 불변성 보장
                        테스트 용이성 최고!! 직접 new로 주입 가능!
                        가장 권장되는 방법!!!

     */

    @Autowired
    private MemberRepository memberRepository;




    // 테스트코드
    public static void main(String[] args) {
        //MemberService memberService = new MemberService(??);
    }

}
