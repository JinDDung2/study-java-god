package chapter4;

public class ProfilePrint {
    private byte age;
    private String name;
    private boolean isMarried;

    public ProfilePrint() {}

    public void setAge(byte age) {
        this.age = age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void isMarried() {
        this.isMarried = true;
    }

    public String getName() {
        return this.name;
    }

    public byte getAge() {
        return this.age;
    }

    public boolean getMarried() {
        return this.isMarried;
    }

    public static void main(String[] args) {
        ProfilePrint profile = new ProfilePrint();
        profile.setAge((byte) 30);
        profile.setName("kim");
        profile.isMarried();

        System.out.println("name = " + profile.getName());
        System.out.println("age = " + profile.getAge());
        System.out.println("isMarried = " + profile.getMarried());
    }
}
