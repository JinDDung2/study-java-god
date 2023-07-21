package practice.coffee;

public class MenuItem {
    private String name;
    private int cost;

    public MenuItem(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public int getCost() {
        return this.cost;
    }

    public String getName() {
        return this.name;
    }
}
