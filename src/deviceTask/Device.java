package deviceTask;

public abstract class Device {

    private final String brand, model;
    private double price;
    private String color;
    private boolean hasBattery, hasPowerButton;

    public Device(String model, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        this.brand = getClass().getSimpleName();
        if (model == null || model.isEmpty() || model.isBlank()) {
            System.err.println("Model cannot be null or empty or blank");
            System.exit(1);
        }
        this.model = model;
        setPrice(price);
        setColor(color);
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.err.println("Price cannot be negative");
            System.exit(1);
            //throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=$" + price +
                ", color='" + color + '\'' +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }

}
/*
1. Create an Abstract Class Named 'Device':
    - Variables:
        - final brand
        - final model
        - price
        - color
        - hasBattery
        - hasPowerButton
    - Encapsulate all fields.
    - Constructor: Initializes all fields.
    - Abstract Methods:
        - turnOn()
        - turnOff()
    - Non-Abstract Method:
        - toString()
 */