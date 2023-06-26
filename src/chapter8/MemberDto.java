package chapter8;

import java.util.Objects;

public class MemberDto {
    private String name;
    private int age;


    public MemberDto() {}

    public MemberDto(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "MemberDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberDto memberDto = (MemberDto) o;
        return age == memberDto.age && Objects.equals(name, memberDto.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
