package chapter12;

import java.util.HashSet;
import java.util.Objects;

public class Identity {

    private final String name;
    private int num;

    public Identity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Identity identity = (Identity) obj;
        return this.name.equals(identity.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, num);
    }


    /*
    [ Guaidlines to override hashCode() & equals() ]
    hashCode와 equals를 생성하기 위해서는 같은 attribute를 이용하라.(e.g. blog.Identity name)
    equals는 일관되어야 한다. 즉, 객체가 수정되지 않았다면 항상 결과가 동일해야 한다.
    a.equals(b) == true이면, a.hashCode() == b.hashCode() 역시 true여야 한다.
    두 메소드는 항상 함께 오버라이드 되어야 한다.
    */

    public static void main(String[] args) {
        String s1 = "test";
        String s2 = "test";

        System.out.println(s1 == s2); // equals 정의 전 false
        System.out.println(s1.equals(s2)); // true

        Identity firstIdentity = new Identity("number");
        Identity secondIdentity = new Identity("number");

        System.out.println(firstIdentity.equals(secondIdentity)); // true

        HashSet<Identity> identities = new HashSet<>();

        identities.add(firstIdentity);
        identities.add(secondIdentity);

        System.out.println(identities.size());
    }
}
