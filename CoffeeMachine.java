
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

class CoffeeMachine {
	 private static final Map<String, Double> TOPPINGS;

	    static {
	        TOPPINGS = new HashMap<>();
	        TOPPINGS.put("Milk", 0.5);
	        TOPPINGS.put("Sugar", 0.2);
	        TOPPINGS.put("Caramel", 0.7);
	    }

    private List<Drink> drinks;
    private Stack<String> toppings;
    private double totalBill;

    public CoffeeMachine() {
        drinks = new ArrayList<>();
        toppings = new Stack<>();
        totalBill = 0.0;
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
        totalBill += drink.getPrice();
    }

    public void addTopping(String topping) {
        if (!TOPPINGS.containsKey(topping)) {
            throw new IllegalArgumentException("Invalid topping: " + topping);
        }
        toppings.push(topping);
        totalBill += TOPPINGS.get(topping);
    }

    
    
    public void displayBill() {
    	Date currentDate = new Date();
        
        System.out.println("--------- Bill ---------");
        for (Drink drink : drinks) {
            System.out.printf("%s: $%.2f%n", drink.getDescription(), drink.getPrice());
        }
        for (String topping : toppings) {
            double toppingPrice = TOPPINGS.get(topping);
            System.out.printf("%s topping: $%.2f%n", topping, toppingPrice);
        }
        System.out.printf("Total Bill: $%.2f%n", totalBill);
        System.out.println(currentDate);
        System.out.println("------------------------");
    }
}