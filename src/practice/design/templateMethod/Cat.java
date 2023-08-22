package practice.design.templateMethod;

public class Cat extends Animal{
    @Override
    AnimalToy getToy() {
        return new CatToy();
    }

    @Override
    void play() {
        System.out.println("니야옹~ 니야옹~");
    }
    @Override
    public void runSomething() {
        System.out.println("오버라이딩된 애교부리기~");
    }

}
