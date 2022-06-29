package hello.core;

import hello.core.mamber.Grade;
import hello.core.mamber.Member;
import hello.core.mamber.MemberService;
import hello.core.mamber.MemberServiceIml;

public class MemberApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceIml();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new Member" + member.getName());
        System.out.println("find Member" + findMember.getName());
    }
}