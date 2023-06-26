package chapter13;

import chapter8.MemberDto;

public abstract class MemberManagerAbstract {
    public abstract boolean addMember(MemberDto member);
    public abstract boolean removeMember(String name, String phone);
    public abstract boolean updateMember(MemberDto member);
    public void printLong(String data) {
        System.out.println("data = " + data);
    }
}
