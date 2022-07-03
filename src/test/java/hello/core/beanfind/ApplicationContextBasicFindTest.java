package hello.core.beanfind;

import hello.core.AppConfig;
import hello.core.mamber.MemberService;
import hello.core.mamber.MemberServiceIml;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class ApplicationContextBasicFindTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("빈 이름 조회")
    void findAllBean() {
        MemberService memberService =  ac.getBean("memberService", MemberService.class);
        assertThat(memberService).isInstanceOf(MemberServiceIml.class);
    }

    @Test
    @DisplayName("이름 없이 타입으로만 조회")
    void findBeanByType() {
        MemberService memberService =  ac.getBean(MemberService.class);
        assertThat(memberService).isInstanceOf(MemberServiceIml.class);
    }
    @Test
    @DisplayName("구체타입으로 조회")
    void findAllBean2() {
        MemberService memberService =  ac.getBean("memberService", MemberService.class);
        assertThat(memberService).isInstanceOf(MemberServiceIml.class);
    }

    @Test
    @DisplayName("빈 이름 조회 X")
    void findAllBeanX() {
       // MemberService memberService =  ac.getBean("XXX", MemberService.class);
        //assertThat(memberService).isInstanceOf(MemberServiceIml.class);
        assertThrows(NoSuchBeanDefinitionException.class,
                () -> ac.getBean("XXX",MemberService.class));
    }
}
