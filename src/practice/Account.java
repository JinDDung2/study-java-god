package practice;

public class Account {

    private static Integer money;

    public Account() {
    }

    public static Integer getMoney() {
        return money;
    }

    public static void setMoney(Integer money) {
        Account.money = money;
    }
}
