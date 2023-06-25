package chapter8;

public class Reference {
    public void callPassByValue() {
        int a = 100;
        String b = "b";
        System.out.println("before passByValue");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        passByValue(a, b);
        System.out.println("after passByValue");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public void passByValue(int a, String b) {
        a = 1000;
        b = "change";
        System.out.println("in passByValue");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public void callByReference() {
        MemberDto member = new MemberDto("wonrok", 20);
        System.out.println("before passByReference");
        System.out.println("member = " + member);
        passByReference(member);
        System.out.println("after passByReference");
        System.out.println("member = " + member);
    }

    public void passByReference(MemberDto member) {
        member.setName("rokwon");
        member.setAge(27);
    }

    public static void main(String[] args) {
        Reference reference = new Reference();
        reference.callPassByValue();
        /*
        before passByValue
        a = 100
        b = b
        in passByValue
        a = 1000
        b = change
        after passByValue
        a = 100
        b = b
        */
        reference.callByReference();
        /*
        before passByReference
        member = MemberDto{name='wonrok', age=20}
        after passByReference
        member = MemberDto{name='rokwon', age=27}
         */
    }
}
