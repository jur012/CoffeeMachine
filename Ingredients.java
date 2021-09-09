public enum Ingredients {
    ESPRESSO(250, 16, 0, 1, 4),
    LATTE(350, 20, 75, 1, 7),
    CAPPUCCINO(200, 12, 100, 1, 6);

    private final int water;
    private final int milk;
    private final int coffeeBeans;
    private final int cups;
    private final int money;

    Ingredients(int water, int coffeeBeans, int milk, int cups, int money) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.cups = cups;
        this.money = money;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public int getCups() {
        return cups;
    }

    public int getMoney() {
        return money;
    }
}
