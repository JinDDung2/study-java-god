package practice.coffee;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<MenuItem> items = new ArrayList<>();
        items.add(new MenuItem("americano", 1600));
        items.add(new MenuItem("cafuchino", 3200));
        items.add(new MenuItem("smoothe", 3800));
        items.add(new MenuItem("ade", 4200));

        Menu menu = new Menu(items);
        Barista barista = new Barista();
        new Customer().orderMenu("americano", menu, barista);
    }
}
