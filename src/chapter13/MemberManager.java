package chapter13;

import chapter8.MemberDto;

public interface MemberManager {
    boolean addMember(MemberDto member);
    boolean removeMember(String name, String phone);
    boolean updateMember(MemberDto member);
}
