package practice.coffee;

public class Customer {

    public void orderMenu(String menuName, Menu menu, Barista barista) {
        MenuItem menuItem = menu.chooseMenu(menuName);
        Coffee coffee = barista.makeCoffee(menuItem);
        System.out.printf("주무하신 %s 나왔습니다.%n", coffee.getName());
    }
}
