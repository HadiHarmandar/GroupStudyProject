package deviceTask;

public class Dell extends PersonalComputer {

    public Dell(String model, double price, String color, boolean hasBattery, boolean hasPowerButton, String cpu) {
        super(model, price, color, hasBattery, hasPowerButton, cpu);
    }

    @Override
    public void showCpu() {
        System.out.println(getCpu());
    }

    @Override
    public void turnOn() {
        System.out.println(getModel() + " turned on");
    }

    @Override
    public void turnOff() {
        System.out.println(getModel() + " turned off");
    }
}
