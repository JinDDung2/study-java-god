package practice.design.templateMethod;

public class CatToy extends AnimalToy{
    @Override
    AnimalToy identify() {
        return new CatToy();
    }
}
