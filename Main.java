import java.util.Date;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static CoffeeMachine coffeeMachine = new CoffeeMachine();

    public static void main(String[] args) {
        displayMenu();
    }

    private static void displayMenu() {
        System.out.println("\nSelect an option:");
        System.out.println("1. Add Coffee");
        System.out.println("2. Add Tea");
        System.out.println("3. Add Topping");
        System.out.println("4. Show Total Bill");
        System.out.println("5. Exit");

        int option = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (option) {
            case 1:
                System.out.println("Enter Coffee Type (Espresso, Cappuccino, Latte):");
                String coffeeType = scanner.nextLine();
                if (isValidCoffeeType(coffeeType)) {
                Drink coffee = new Coffee(coffeeType);
                coffeeMachine.addDrink(coffee);
                System.out.println(coffee.getDescription() + " added.");
                }else {
                    System.out.println("Invalid coffee type. Please try again.");
                }
                
                break;
            case 2:
                System.out.println("Enter Tea Type (Black, Green, Herbal):");
                String teaType = scanner.nextLine();
                if (isValidTeaType(teaType)) {
                Drink tea = new Tea(teaType);
                coffeeMachine.addDrink(tea);
                System.out.println(tea.getDescription() + " added.");
                }else {
                    System.out.println("Invalid tea type. Please try again.");
                }
                break;
            case 3:
                System.out.println("Enter Topping Name (Milk, Sugar, Caramel):");
                String topping = scanner.nextLine();
                coffeeMachine.addTopping(topping);
                System.out.println(topping + " topping added.");
                break;
            case 4:
            	coffeeMachine.displayBill();
                
                break;
            case 5:
                System.out.println("Thank you for using the Coffee/Tea Machine!");
                System.exit(0);
            default:
                System.out.println("Invalid option. Please try again.");
        }

        displayMenu(); // Recursively display the menu after each selection
    }
    
    private static boolean isValidTeaType(String teaType) {
        return teaType.equals("Black") || teaType.equals("Green") || teaType.equals("Herbal");
    }
    private static boolean isValidCoffeeType(String coffeeType) {
        return coffeeType.equals("Espresso") || coffeeType.equals("Cappuccino") || coffeeType.equals("Latte");
    }

}