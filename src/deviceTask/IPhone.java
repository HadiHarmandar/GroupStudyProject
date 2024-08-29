package deviceTask;

public class IPhone extends Phone implements AppleApps {


    public IPhone(String model, double price, String color, boolean hasBattery, boolean hasPowerButton, long phoneNumber) {
        super(model, price, color, hasBattery, hasPowerButton, phoneNumber);
    }

    @Override
    public void turnOn() {
        System.out.println(getModel() + " turned on");
    }

    @Override
    public void turnOff() {
        System.out.println(getModel() + " turned off");
    }

    @Override
    public void downloadApp() {
        System.out.println(getModel() + " is downloading app");
    }
}
