package JavaProje07.Coffe_Machine_Project_Cozum;

import java.util.Scanner;

public class CoffeeMachine {
    private Scanner scanner;

    public CoffeeMachine() {
        scanner = new Scanner(System.in);
    }

    public void run() {
        ICoffee coffee = selectCoffee();
        if (coffee == null) {
            System.out.println("Invalid selection. Please press a valid button!");
            return;
        }

        System.out.println("You have selected " + coffee.getClass().getSimpleName() + "...");

        if (coffee instanceof IcedICoffee || coffee instanceof Frappuccino) {
            System.out.println("Best way to cool off on a hot summer day... Perfect decision!");
        }

        CoffeeSize size = selectSize();
        System.out.println("Your " + size + " " + coffee.getClass().getSimpleName() + " is getting prepared...");

        boolean wantsMilk = selectYesNo("Would you like to add milk to your " + coffee.getClass().getSimpleName() + "?");
        if (wantsMilk) {
            System.out.println("Milk is being added to your " + coffee.getClass().getSimpleName() + "... Please be patient.");
        } else {
            System.out.println("Your " + coffee.getClass().getSimpleName() + " is being prepared without milk.");
        }

        boolean wantsSugar = selectYesNo("Would you like any sugar to your " + coffee.getClass().getSimpleName() + "?");
        if (wantsSugar) {
            int sugarAmount = selectSugarAmount();
            System.out.println("Your " + size + " " + coffee.getClass().getSimpleName() + " is being prepared with " +
                    sugarAmount + " cube(s) of sugar.");
        } else {
            System.out.println("Your " + size + " " + coffee.getClass().getSimpleName() + " is being prepared without sugar.");
        }

        System.out.println("Thank you for using the coffee machine. Enjoy your coffee!");
    }
    private ICoffee selectCoffee() {
        System.out.println("Select a coffee type:");
        System.out.println("1. Americano");
        System.out.println("2. Espresso");
        System.out.println("3. Cappuccino");
        System.out.println("4. Latte");
        System.out.println("5. Mocha");
        System.out.println("6. Macchiato");
        System.out.println("7. Affogato");
        System.out.println("8. Iced Coffee (Cold coffee)");
        System.out.println("9. Frappuccino (Cold coffee)");
        System.out.println("10. Irish Coffee");

        int coffeeChoice = scanner.nextInt();

        switch (coffeeChoice) {
            case 1:
                return new Americano();
            case 2:
                return new Espresso();
            case 3:
                return new Cappuccino();
            case 4:
                return new Latte();
            case 5:
                return new Mocha();
            case 6:
                return new Macchiato();
            case 7:
                return new Affogato();
            case 8:
                return new IcedICoffee();
            case 9:
                return new Frappuccino();
            case 10:
                return new IrishCoffee();
            default:
                return null;
        }
    }

    private CoffeeSize selectSize() {
        System.out.println("Please select the size of your coffee:");
        System.out.println("1. Small");
        System.out.println("2. Medium");
        System.out.println("3. Large");
        System.out.println("4. XLarge");

        int sizeChoice = scanner.nextInt();

        switch (sizeChoice) {
            case 1:
                return CoffeeSize.SMALL;
            case 2:
                return CoffeeSize.MEDIUM;
            case 3:
                return CoffeeSize.LARGE;
            case 4:
                return CoffeeSize.XLARGE;
            default:
                return null;
        }
    }

    private boolean selectYesNo(String message) {
        System.out.println(message + " (Type Yes or No)");

        String choice = scanner.next();
        return choice.equalsIgnoreCase("Yes");
    }

    private int selectSugarAmount() {
        System.out.println("How many sugars would you like?");
        return scanner.nextInt();
    }
}
