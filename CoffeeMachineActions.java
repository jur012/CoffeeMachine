import java.util.Objects;
import java.util.Scanner;

public class CoffeeMachineActions {

    Scanner scanner = new Scanner(System.in);

    private int water = 400;
    private int milk = 540;
    private int coffeeBeans = 120;
    private int cups = 9;
    private int money = 550;

    public void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String coffeeNumber = scanner.next();
        if (Objects.equals(coffeeNumber, "back")) {
            return;
        }

        String coffeeType = "";

        switch (coffeeNumber) {
            case "1":
                coffeeType = "ESPRESSO";
                break;
            case "2":
                coffeeType = "LATTE";
                break;
            case "3":
                coffeeType = "CAPPUCCINO";
                break;
        }

        if (water >= Ingredients.valueOf(coffeeType).getWater() && coffeeBeans >= Ingredients.valueOf(coffeeType).getCoffeeBeans()
                && milk >= Ingredients.valueOf(coffeeType).getMilk() && cups >= Ingredients.valueOf(coffeeType).getCups()) {

            water -= Ingredients.valueOf(coffeeType).getWater();
            coffeeBeans -= Ingredients.valueOf(coffeeType).getCoffeeBeans();
            milk -= Ingredients.valueOf(coffeeType).getMilk();
            cups -= Ingredients.valueOf(coffeeType).getCups();
            money += Ingredients.valueOf(coffeeType).getMoney();

            System.out.println("I have enough resources, making you a coffee!");
        } else {
            System.out.println("Can't make a cup of coffee.");
            return;
        }
    }

    public void fill() {
        System.out.println("Write how many ml of water you want to add:");
        water += scanner.nextInt();

        System.out.println("Write how many ml of milk you want to add:");
        milk += scanner.nextInt();

        System.out.println("Write how many grams of coffee beans you want to add:");
        coffeeBeans += scanner.nextInt();

        System.out.println("Write how many disposable cups of coffee you want to add:");
        cups += scanner.nextInt();
    }

    public void take() {
        System.out.printf("I gave you $%d\n", money);
        money = 0;
    }

    public void remaining() {
        System.out.printf("The coffee machine has:\n%d ml of water\n%d ml of milk\n%d g of coffee beans\n%d disposable cups\n$%d of money\n",
                water, milk, coffeeBeans, cups, money);
    }
}
