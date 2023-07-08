class Coffee extends Drink {
    private String type;

    public Coffee(String type) {
        super("Coffee");
        this.type = type;
    }

    public double getPrice() {
        switch (type) {
            case "Espresso":
                return 1.5;
            case "Cappuccino":
                return 2.0;
            case "Latte":
                return 2.5;
            default:
                throw new IllegalArgumentException("Invalid coffee type: " + type);
        }
    }

    public String getDescription() {
        return type + " " + super.getDescription();
    }
}