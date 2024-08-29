package deviceTask;

public abstract class Computer extends Device {

    private String cpu;

    public Computer(String model, double price, String color, boolean hasBattery, boolean hasPowerButton, String cpu) {
        super(model, price, color, hasBattery, hasPowerButton);
        setCpu(cpu);
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public abstract void showCpu();

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", cpu=" + cpu +
                '}';
    }
}
/*
3. Create a Child Abstract Class of Device Named 'Computer':
    - Add extra methods as needed.
 */
