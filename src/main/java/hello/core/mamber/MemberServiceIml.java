package hello.core.mamber;

public class MemberServiceIml implements MemberService{

    private final MemberRepository memberRepository;

    public MemberServiceIml(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberID) {
        return memberRepository.findById(memberID);
    }
}
