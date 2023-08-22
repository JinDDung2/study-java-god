package practice.design.templateMethod;

public abstract class Animal {

    // 팩터리 메서드 패턴
    abstract AnimalToy getToy();

    // 템플릿 메서드 패턴
    public void playWithOwner() {
        System.out.println("반려동물 이리온~");
        play();
        runSomething();
        System.out.println("잘했어~ 간식 여기~");
    }

    // 추상 메서드
    abstract void play();
    // Hook 메서드
    public void runSomething() {
        System.out.println("애교부리기!");
    }
}
