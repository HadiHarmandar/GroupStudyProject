package deviceTask;

public abstract class Phone extends Device {

    private long phoneNumber;

    public Phone(String model, double price, String color, boolean hasBattery, boolean hasPowerButton, long phoneNumber) {
        super(model, price, color, hasBattery, hasPowerButton);
        setPhoneNumber(phoneNumber);
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void call(long phoneNum) {
        System.out.println("Calling phone " + phoneNum);
    }

    public void text(long phoneNum) {
        System.out.println("Text phone " + phoneNum);
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
/*
2. Create a Child Abstract Class of Device Named 'Phone':
    - Extra Non-Abstract Methods:
        - call(long phoneNum)
        - text(long phoneNum)
        - toString()
 */