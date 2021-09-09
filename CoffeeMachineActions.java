import java.util.Objects;
import java.util.Scanner;

public class CoffeeMachineActions {

    Scanner scanner = new Scanner(System.in);

    private int water = 400;
    private int milk = 540;
    private int coffeeBeans = 120;
    private int cups = 9;
    public int money = 550;

    public void buy(String coffeeNumber) {
        String coffeeType = "";

        if (Objects.equals(coffeeNumber, "back")) {
            return;
        }

        if (Objects.equals(coffeeNumber, "1") && water >= 250 && coffeeBeans >= 16 && cups >= 1) {
            coffeeType = "ESPRESSO";
        } else if (Objects.equals(coffeeNumber, "2") && water >= 350 && coffeeBeans >= 20 && milk >= 75 && cups >= 1) {
            coffeeType = "LATTE";
        } else if (Objects.equals(coffeeNumber, "3") && water >= 200 && coffeeBeans >= 12 && milk >= 100 && cups >= 1) {
            coffeeType = "CAPPUCCINO";
        } else {
            System.out.println("Can't make a cup of coffee.");
            return;
        }

        water -= Ingredients.valueOf(coffeeType).getWater();
        coffeeBeans -= Ingredients.valueOf(coffeeType).getCoffeeBeans();
        milk -= Ingredients.valueOf(coffeeType).getMilk();
        cups -= Ingredients.valueOf(coffeeType).getCups();
        money += Ingredients.valueOf(coffeeType).getMoney();

        System.out.println("I have enough resources, making you a coffee!");
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
    }

    public void remaining() {
        System.out.printf("The coffee machine has:\n%d ml of water\n%d ml of milk\n%d g of coffee beans\n%d disposable cups\n$%d of money\n",
                water, milk, coffeeBeans, cups, money);
    }
}
