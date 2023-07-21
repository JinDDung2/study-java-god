package practice.coffee;

public class Barista {

    public Coffee makeCoffee(MenuItem menuItem) {
        return new Coffee(menuItem.getName(), menuItem.getCost());
    }
}
