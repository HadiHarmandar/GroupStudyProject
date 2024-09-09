package oopReview;

public class Driver extends Employee {


    public Driver(String name, int age, String employeeId, double salary, String companyName) {
        super(name, age, employeeId, salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is driving.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating Taco Bell");
    }
}
