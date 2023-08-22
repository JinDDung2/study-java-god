package practice.design.templateMethod;

public class DogToy extends AnimalToy{
    @Override
    AnimalToy identify() {
        return new DogToy();
    }
}
