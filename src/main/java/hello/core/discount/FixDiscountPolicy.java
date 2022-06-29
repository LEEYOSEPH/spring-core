package hello.core.discount;

import hello.core.mamber.Grade;
import hello.core.mamber.Member;

public class FixDiscountPolicy implements  DiscountPolicy{

    private int discountFixAmount = 1000; // 천원 할인

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.BASIC) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
