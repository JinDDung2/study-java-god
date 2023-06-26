package chapter13;

import chapter8.MemberDto;

public class MemberManagerAbstractImpl extends MemberManagerAbstract{
    @Override
    public boolean addMember(MemberDto member) {
        return false;
    }

    @Override
    public boolean removeMember(String name, String phone) {
        return false;
    }

    @Override
    public boolean updateMember(MemberDto member) {
        return false;
    }
}
