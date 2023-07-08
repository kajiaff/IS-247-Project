class Tea extends Drink {
    private String type;

    public Tea(String type) {
        super("Tea");
        this.type = type;
    }

    public double getPrice() {
        switch (type) {
            case "Black":
                return 1.0;
            case "Green":
                return 1.2;
            case "Herbal":
                return 1.5;
            default:
                throw new IllegalArgumentException("Invalid tea type: " + type);
        }
    }

    public String getDescription() {
        return type + " " + super.getDescription();
    }
}