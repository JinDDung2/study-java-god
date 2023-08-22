package practice.design.templateMethod;

public class Dog extends Animal{

    @Override
    AnimalToy getToy() {
        return new DogToy();
    }

    @Override
    void play() {
        System.out.println("머어엉~ 머어엉~");
    }
}
