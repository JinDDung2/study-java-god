package practice.design.templateMethod;

public class Client {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        cat.playWithOwner();
        System.out.println("---절취선---");
        dog.playWithOwner();
        System.out.println("---------------");
        AnimalToy catToy = cat.getToy();
        AnimalToy dogToy = dog.getToy();
        System.out.println(catToy instanceof CatToy);
        System.out.println(dogToy instanceof DogToy);
    }
}
