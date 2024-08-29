package deviceTask;

public class Samsung extends Phone implements AndroidApps {

    public Samsung(String model, double price, String color, boolean hasBattery, boolean hasPowerButton, long phoneNumber) {
        super(model, price, color, hasBattery, hasPowerButton, phoneNumber);
    }

    @Override
    public void turnOn() {
        System.out.println(getModel() + " is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println(getModel() + " is turned off");
    }

    @Override
    public void downloadApp() {
        System.out.println(getModel() + " is downloading app");
    }
}
