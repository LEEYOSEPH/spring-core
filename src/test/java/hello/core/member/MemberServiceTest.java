package hello.core.member;

import hello.core.mamber.Grade;
import hello.core.mamber.Member;
import hello.core.mamber.MemberService;
import hello.core.mamber.MemberServiceIml;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceIml();

    @Test
    void join() {
        //given
        Member member = new Member(1L,"memberA", Grade.VIP);
        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then
        Assertions.assertThat(member).isEqualTo(findMember);

    }
}
