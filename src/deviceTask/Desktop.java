package deviceTask;

public class Desktop extends PersonalComputer {

    public Desktop(String model, double price, String color, boolean hasBattery, boolean hasPowerButton, String cpu) {
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
