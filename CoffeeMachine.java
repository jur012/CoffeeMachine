import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {

        CoffeeMachineActions actions = new CoffeeMachineActions();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            switch (scanner.next()) {
                case "buy":
                    actions.buy();
                    break;
                case "fill":
                    actions.fill();
                    break;
                case "take":
                    actions.take();
                    break;
                case "remaining":
                    actions.remaining();
                    break;
                case "exit":
                    System.exit(0);
            }
        }
    }
}
