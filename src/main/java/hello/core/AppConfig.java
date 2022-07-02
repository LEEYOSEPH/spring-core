package hello.core;

import hello.core.discount.FixDiscountPolicy;
import hello.core.mamber.MemberService;
import hello.core.mamber.MemberServiceIml;
import hello.core.mamber.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceIml(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }

}
