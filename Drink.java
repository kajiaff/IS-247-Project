
abstract class Drink {
    protected String name;

    public Drink(String name) {
        this.name = name;
    }

    public abstract double getPrice();

    public String getDescription() {
        return name;
    }
}