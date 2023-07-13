package chapter22;

public class WildCardMain {
    public static void main(String[] args) {
        WildCardMain wildCardMain = new WildCardMain();
        wildCardMain.callWildCardGeneric();
    }

    public void callWildCardGeneric() {
        WildCardGeneric<String> wildCardGeneric = new WildCardGeneric<>();
        wildCardGeneric.setWildCard("hello");
        wildCardStringMethod(wildCardGeneric);
    }

    public void wildCardStringMethod(WildCardGeneric<?> c) {
        Object value = c.getWildCard();
        if (value instanceof String) {
            System.out.println(value);
        }
    }
}
